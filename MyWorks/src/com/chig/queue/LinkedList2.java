package com.chig.queue;

import java.util.Scanner;

import com.chig.queue.QueueUsingLinkedList.Node;

public class LinkedList2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		begin();
	}

	static class Node{
		int data;
		Node nextNode;
		public Node(){
		}
	}


	private static Node startNode;

	private static void insert(){
		System.out.println("Enter the element you want to insert : ");
		int elementToInsert = sc.nextInt();
		Node node = new Node();
		node.data = elementToInsert;
		if(startNode == null){
			startNode = node;
		}
		else{
			Node tempNode = startNode;
			while(tempNode.nextNode != null){
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = node;
		}

	}

	private static void deleteLast(){
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


	private static void deleteFirst(){
		Node tempNode = startNode;
		if(startNode == null){
			System.out.println("no elements to delete!");
		}else if(startNode.nextNode == null){
			startNode = null;
		}else{
			while(tempNode.nextNode != null){
				tempNode = tempNode.nextNode;
			}
			
		}

	}

	private static void deleteBySearch(){
		System.out.println("Available elements are :");
		display();
		System.out.println("enter the element you want to delete :");
		int elementToDelete = sc.nextInt();
		Node tempNode = startNode;
		if(startNode == null){
			System.out.println("No elements to delete");

		}else if(tempNode.nextNode == null && tempNode.data == elementToDelete){
			startNode = null;
		}
		else{

			while(tempNode.nextNode != null){
				if(tempNode.data == elementToDelete ){
					tempNode = tempNode.nextNode;
				}
			}
			tempNode.nextNode = null;
		}

	}

	private static void display(){

		if(startNode == null){
			System.out.println("no elements to display");
		}else {
			Node tempNode = startNode;
			do{
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			}while(tempNode != null);
		}
	}



	private static void begin()
	{
		for(;;){
			System.out.println("---- MENU -----");
			System.out.println("1.insert");
			System.out.println("2.delete");
			System.out.println("3.display");
			System.out.println("---------------");
			System.out.println("enter your choice :");
			int choice = sc.nextInt();
			switch(choice){
			case 1 : insert();
			break;
			case 2 : deleteLast();
			break;
			case 3 : display();
			break;
			case 4 : System.exit(0);
			}
		}
	}
}







