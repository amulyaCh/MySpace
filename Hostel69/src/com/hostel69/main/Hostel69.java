package com.hostel69.main;



import java.util.InputMismatchException;
import java.util.Scanner;

import com.hostel69.dbconnections.Hostel69DaoImplementation;


public class Hostel69 {
	

	public static void main(String[] args) throws Exception 
	{
		//mainMenu();
		userLogin();
	}

		
	/** Allow the user to try 3 times to login, else show a message to check the credentials 
	 * @throws Exception */
	private static void userLogin() throws Exception 
	{

		int no_of_chances_to_Login = 3;
		while(no_of_chances_to_Login != 0)
		{
			if(validate()) {
				System.out.println("Login!" + "\n"+ "\n");
				break;
			}
			else
			{
				System.out.println("Unable to Login.Password doesnt match. " + "\n" + "Please try again."+ "\n"+ "\n");
				no_of_chances_to_Login--;
			}
			
		}
		mainMenu();
	}
	
	

	
	private static boolean validate() throws Exception {
		Hostel69DaoImplementation h69DaImpl = new Hostel69DaoImplementation();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("enter username : ");
		
		String usr = sc1.next();
		
		System.out.print("enter password : ");
		
		String pwd = sc1.next();
		
		boolean usernameSuccess = h69DaImpl.validate(usr);
		
		if(usernameSuccess) {
			boolean success  = h69DaImpl.validate(usr, pwd);
			if(success) {
				return true;
			}
		}
		else {
			System.out.println("Username doesn't match...!!!");
		}
		return false;
		
	}



	private static void mainMenu() {
		System.out.println("     Welcome to Hostel69     ");
		System.out.println("     -------------------"+ "\n");
		System.out.println("Displaying Menu of Operations"+ "\n");
	
		System.out.println("1. Make a Reservation");
		System.out.println("2. Cancel a Reservation");
		System.out.println("3. View Available"+ "\n");

		System.out.print("Please enter your choice : ");
		int choice = 0;


		/** this is called try with resources. */
		try(Scanner sc = new Scanner(System.in);)
		{		
			choice = sc.nextInt();

		}catch(InputMismatchException | NullPointerException e){
			System.out.println("Accepts only numbers as input."+"\n"+"Does not accept spaces,alphabets and special characters.");
		}
		switch(choice)
		{ 
		case 1:
			System.out.println("your choice is 1.");
			break;
		case 2:
			System.out.println("your choice is 2.");
			break;
		case 3:
			System.out.println("your choice is 3.");
			break;
		default:
			System.out.println("\n" +"Available options are only 1, 2 or 3."+"\n" +"Please check and reenter your choice.");
		}
	}	


	
	private static void book()
	{
		System.out.print("Enter Hostel Id :");	
		Scanner sc2 = new Scanner(System.in);
		String hostelId = sc2.next();
		System.out.println("Enter Start Date: ");
		String startDate = sc2.next();
		System.out.println("Enter End Date: ");
		String endDate = sc2.next();
		try{
//			List<RoomBean> room = service.ch	
		}catch(Exception e){
			
		}
		
		
	}
}




