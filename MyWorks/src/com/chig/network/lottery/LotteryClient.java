package com.chig.network.lottery;

import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

public class LotteryClient implements Runnable {



	private static Socket clientSocket = null;
	private static PrintStream os = null;
	private static BufferedReader in = null;


	private static BufferedReader kbdReader = null;
	private static boolean closeConnection = false;

	public static void main(String[] args) {

		
		int PORT_NUM = 7000;
		
		String hostName = "localhost";

		if (args.length != 2) {
			System.out.println("Usage: java ChatClient <host> <portNumber>\n");
			System.exit(0);
		} else {
			hostName = args[0];
			PORT_NUM = Integer.parseInt(args[1]);
		}

		
		try {
			
			clientSocket = new Socket(hostName, PORT_NUM);
			kbdReader = new BufferedReader(new InputStreamReader(System.in));
			os = new PrintStream(clientSocket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));;
		} catch(Exception e){
			e.printStackTrace();
		}		
		try {

			
			new Thread(new LotteryClient()).start();
			while (!closeConnection) {
				os.println(kbdReader.readLine().trim());
			}
	
			os.close();
			in.close();
			clientSocket.close();
		} catch (IOException e) {
			System.err.println("IOException:  " + e);
		}finally{
			if(os != null ) os=null;
			if(in != null) in=null;
			if(clientSocket != null) clientSocket = null;
		}

	}


	public void run() {
	
		String serverReply;
		try {
			while (true) {
				serverReply = in.readLine();
				if(serverReply == null)
                                break;
                                else{
				System.out.println(new String(serverReply));
                             if (serverReply.equalsIgnoreCase("time is up try next time"))
                               break;
                              }
							}
			closeConnection = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}