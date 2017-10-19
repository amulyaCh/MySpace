package com.chig.network.lottery;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Hashtable;
import java.util.Set;
import java.util.Random;
public class LotteryServer {
    
	private static ServerSocket serverSocket = null;
	private static Socket clientSocket = null;

	private static final LotteryServerThread[] clientsInfo = new LotteryServerThread[4];
	private static int PORT_NUM = 7000;
	public static void main(String args[]) {

		if (args.length != 1) {
			System.out.println("Required Arguments: port number");
			System.exit(0);
		}

		PORT_NUM = Integer.parseInt(args[0]);

		try {
			System.out.println("The server is running.");
			serverSocket = new ServerSocket(PORT_NUM);
		} catch (Exception e) {
			e.printStackTrace();
		}

		while (true) {
			try {

				
				clientSocket = serverSocket.accept();

				int i = 0;

				
				for (i = 0; i < 4; i++) {
					if (clientsInfo[i] == null) {
						(clientsInfo[i] = new LotteryServerThread(clientSocket, clientsInfo)).start();
			             			
						break;
					}
				}

				
				if (i == 4) {
					PrintStream os = new PrintStream(clientSocket.getOutputStream());
					os.println("time is up try next time");
					os.close();
					clientSocket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


class LotteryServerThread extends Thread {
    //int count=0;
	private BufferedReader in = null;
	private PrintStream out = null;
	private Socket clientSocket = null;
	private LotteryServerThread[] clientsInfo;
	private String clientName = null;
     //   private int lotteryNum=0;
        // private int randomNum=0;


        private int lotteryassign = 0;
	private int lotterynumbers[] = {123, 456, 789};
        Random randomwinner = new Random();
	private int winnernumber =0;
	Random winnerassign = new Random(); 


	private static Hashtable<String, String> usersSet = new Hashtable<String, String>();
       

	public LotteryServerThread(Socket clientSocket, LotteryServerThread[] clientsInfo) {
		this.clientSocket = clientSocket;
		this.clientsInfo = clientsInfo;
	}

	public void run() {
		try{
                         
			           
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new PrintStream(clientSocket.getOutputStream());

			
			String userName;
              //int count;          
			while (true) {
                               
				System.out.println("new user registration");
				out.println("Enter your user name.");
				userName = in.readLine();
                   if(usersSet.containsKey(userName)){
					out.println("The name is already registered, please use a different name");
				}else{
					usersSet.put(userName,userName);
					for (int i = 0; i < clientsInfo.length; i++) {

						
						if (clientsInfo[i] != null && clientsInfo[i] == this) {
							
							
							clientsInfo[i].clientName =  userName;
                                                        
                           				clientsInfo[i].lotteryassign = lotterynumbers[randomwinner.nextInt(lotterynumbers.length)] ;
                                    
                                                        out.println("your lottery no is: " +clientsInfo[i].lotteryassign);
						}
		}
					out.println("your  registration was successful wait for some time to know the results");
                                        
                              
                                      Thread.sleep(40000);
                                    		  
                                        
                                      int count = Thread.activeCount();
                                 
                                      if(count==5){
                                         winnernumber = lotterynumbers[winnerassign.nextInt(lotterynumbers.length)];
                                        System.out.println("winning no is " +winnernumber);
                                        
                                        for(int i=0;i<clientsInfo.length;i++)
                                      {
                                      if(clientsInfo[i].lotteryassign== winnernumber)
                                      {
                                      clientsInfo[i].out.println("congracts you are the winner");
                                     //break;
                                      }

                                     }        
					                    break;
                                      }
                                      
                                      
				}
   
                           

          break;
}

                        in.close();
			out.close();
			clientSocket.close();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}finally{
			if(in!= null) in = null;
			if(out!= null) out = null;
			if(clientSocket!= null) clientSocket = null;
		}
		
	}
}