package com.chig.collection;

import java.util.ArrayList;
import java.util.Scanner;


/** 
 * list of employes (add,delete,search,using list class implement using list)
 * */
public class Practice{
	
	private static ArrayList e = new ArrayList();
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			displayMenu();
			System.out.print("Enter your choice : ");
			int choice =  scanner.nextInt();
			switch(choice) {
			case 1: add();
			break;
			case 2: delete();
			break;
			case 3: search();
			break;
			case 4: scanner.close(); System.exit(1);
			break;
			default : System.out.println("Wrong Choice ...!!!");
			}
		}
		
	}
	
	public static void displayMenu() {
		System.out.println("**************");
		System.out.println("1.Add");
		System.out.println("2.Delete");
		System.out.println("3.Search");
		System.out.println("4.Exit");
		System.out.println("**************");
	}
	
  public static void add(){
	  System.out.print("enter the id : ");
	  int id = scanner.nextInt();
	  System.out.print("enter name : ");
	  String name = scanner.next();
	  Employee o = new Employee(id, name);
	  e.add(o);  
  }
  
  
  public static void delete(){
	  System.out.print("enter the id : ");
	  int id = scanner.nextInt();
	  for (int i = 0; i < e.size(); i++) {
		  Employee emp = (Employee)e.get(i);
		  if(emp.getId() == id) {
			  e.remove(i);
			  return;
		  }
	  }
  }
  
  public static void search(){
	  System.out.print("enter the id : ");
	  int id = scanner.nextInt();
	  for(Object obj : e) {
		  Employee emp = (Employee) obj;
		  if(emp.getId() == id) {
			 System.out.println("Employee is available with id " +  id  + " and his nname is : " + emp.getName());
			 return;
		  }
	  }
	  System.out.println("Employee not found");
  }
  
}
