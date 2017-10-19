package com.chig.stack;

import java.util.Scanner;


public class Stack_One {

	private static Scanner scanner = new Scanner(System.in);
	 static class Node{
		int data;
		Node nextNode;
		public Node(){
			
		}
	}
	 
	public static void main(String[] args) 
	{
		begin();
	}

	private static Node startNode;
	private static void add()
	{
		System.out.print("Enter the Number : ");
		int data = scanner.nextInt();
		Node node = new Node();
		node.data = data;
       if(startNode == null){
    	   startNode = node;
       }else{
    	   Node tempNode = startNode;
    	   while(tempNode.nextNode != null){
    		   tempNode = node;
    	   }
    	   tempNode.nextNode = node;
       }
	}

	
	private static void delete()
	{
		Node tempNode = startNode;
		if(startNode == null) {
			System.out.println("list is empty");
		}
		else if(tempNode.nextNode == null) {
			startNode = null;
		}
		else {
			while(tempNode.nextNode.nextNode !=null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = null;
		}

	}
	
	private static void display(){
		if(startNode == null) {
			System.out.println("List is empty");
		} else {
			Node tempNode = startNode;
			do {
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			} while(tempNode != null);
		}
	}
	
	private static void begin() 
	{
		for(;;)
		{
			System.out.println("------MENU------");
			System.out.println("1.Add");
			System.out.println("2.Delete");
			System.out.println("3.Dispaly");
			System.out.println("4.Exit");
			System.out.println("------MENU------");
			System.out.print("Enter your choice :");
			int choice = scanner.nextInt();
			switch(choice){
			case 1 : 
				add();
				break;
			case 2 : 
				delete();
				break;
			case 3 : 
				display();
				break;
			case 4 : 
				scanner.close();
				System.exit(0);
				break;
			}
		}
	}
}
