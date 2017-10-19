package com.chig.queue;

import java.util.Scanner;

public class FindMiddleElementInQueue {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		addNode();
		

		display();
		findMiddleElementOptimal();
	}
	private static class Node {
		int data;
		Node nextNode;
		public Node(){

		}
	}
	private static int nodeCount = 0;
	private static Node startNode;
	private static void addNode(){

		System.out.print("enter your element to insert :");
		int elementToInsert = scanner.nextInt();
		Node node = new Node();
		node.data = elementToInsert;
		if(startNode == null){
			startNode = node;
			nodeCount += 1;
		}else{
			Node tempNode = startNode;
			while(tempNode.nextNode != null){
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = node;
			nodeCount += 1;
		}

	}
	private static void display(){
		System.out.println("count = " + nodeCount);
		if(startNode == null){
			System.out.println("No elements to display!");
		}else{
			Node tempNode  = startNode;
			do{
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			}while(tempNode != null);
		}
	}

	private static void findMiddleElementOptimal(){
		// 1   2   3  4  5->  
		// |   ||  
		//      |     ||
		//         |

		Node tempNode = startNode;
		Node secondNode = startNode;
		if(tempNode == null) {
			System.out.println("List is empty");
		} else{
			while(tempNode.nextNode != null) 
			{
				if(secondNode.nextNode != null && secondNode.nextNode.nextNode != null) 
				{
					tempNode = tempNode.nextNode;
					
					secondNode =  secondNode.nextNode.nextNode;
				} else 
				{
					break;
				}
			}
		}
		System.out.println("Middle element of the queue is :"+tempNode.data);
	}


	private static void findMiddleElement(){
		// 1   2   3  4  5->  
		// |   ||  
		//      |     ||
		//         |

		int middleElement = nodeCount / 2;
		Node tempNode  = startNode;
		while(middleElement != 1)
		{        
			tempNode = tempNode.nextNode;
			middleElement--;
		}
		System.out.println("Middle element of the queue is :"+tempNode.data);
	}

}
