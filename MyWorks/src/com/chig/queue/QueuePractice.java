package com.chig.queue;

import java.util.Scanner;

/** insert , delete, display */
public class QueuePractice {
	
	private static final int SIZE = 3;
	
	private static final int a[] = new int[SIZE];
	
	private static int front = -1;
	
	private static int rear = -1;
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		begin();
	}

	private static void insert() {
		if(rear == SIZE-1) {
			System.out.println("queue is full");
		}
		else { 
			if(front == -1) {
				front=0;
			}
			System.out.print("enter the element you want to insert :");
			int numberToInsert = scanner.nextInt();
			a[++rear] =  numberToInsert; 
		}
	}
//front > rear : as we do not want to delete from null values. if front exceeds rear it means there are no elements in the queue.
	private static void delete() {
		if(front == -1 || front>rear) {
//			rear = -1;
//			front =-1;
			System.out.println("queue is empty");
		} else {
			front++;
		}
	}

	private static void display() {
		if(front == -1 || front>rear) {
//			front=-1;
//			rear=-1;
			System.out.println("queue is empty;No elements to display!");
		}
		else {
			for(int i =front;i<=rear;i++){
				System.out.println(a[i]);
			}
		}
	}
	
	private static void begin() {
		for (;;) {
			System.out.println("------- Menu Options -------");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("------- Menu Options -------");
			System.out.print("enter your choice :");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			case 4:
				scanner.close();
				System.exit(0);
			}
		}
	}

}
