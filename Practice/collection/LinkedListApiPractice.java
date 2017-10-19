package com.chig.collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListApiPractice {
	
	public static void main(String[] args) {
	
		//addTypesTest();
		//clearTest();
		//containsTest();
		//descendingIteratorTest();
		//elementTest();
		//getTypesTest();
		//indexOfTypesTest();
		//listIteratorTest();
        //offerTypesTest();
		//peekTypesTest();
		//pollTypesTest();
		//popTest();
		pushTest();
	}

	
	private static void pushTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("g");
		l1.add("h");
		l1.add("j");
		l1.add("element");
		System.out.println("before push : "+l1);
		
		l1.push("push");
		
		System.out.println("after push  : " + l1);
		
	}
	
	
	private static void popTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("g");
		l1.add("h");
		l1.add("j");
		l1.add("element");
		System.out.println("before pop : "+l1);
		
		l1.pop();
		
		System.out.println("after pop  : " + l1);
		
	}
	
	
	
	private static void pollTypesTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("g");
		l1.add("h");
		l1.add("j");
		l1.add("element");
		
		System.out.println("before poll : "+l1);
		
		l1.poll();
		System.out.println("after poll() : "+l1);
		
		System.out.println();
		
		System.out.println("before poll : "+l1);
	    //pollFirst
        l1.pollFirst();
     	System.out.println("after pollFirst() : "+l1);
		
     	System.out.println();
     	
     	System.out.println("before poll : "+l1);
		//pollLast
        l1.pollLast();
		System.out.println("after pollLast() : "+l1);
		

	}

	
	
	
	
	private static void peekTypesTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("element");
		l1.offer("new");
		
		//peek
		//l1.peek();
		System.out.println(" peek() : "+l1.peek());
		
		
		//peekFirst
        //l1.peekFirst();
		
		System.out.println(" peekFirst() : "+l1.peekFirst());
		
		
		//peekLast
        l1.peekLast();
		
		System.out.println(" peekLast() : "+l1.peekLast());
		

	}
	
	
	
	private static void offerTypesTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("element");
		l1.offer("new");
		
		//offerFirst
		l1.offerFirst("First");
		
		//offerLast
        l1.offerLast("Last");
		
		System.out.println(" offer() : "+l1);
		

	}
	
	
	
	
	private static void listIteratorTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("element");
		
		// iterates the list from the index specified.
		
		ListIterator li = l1.listIterator(1);
		 
		while(li.hasNext()){
			String s = (String)li.next();
            System.out.println(s);
		}
		
	}
	
	
	
	private static void indexOfTypesTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("element");
		l1.add("a");	
	
		System.out.println("get element from the list at specified index : "+l1.indexOf("a"));
		
		//LastIndexOf
		System.out.println("get the last index of specified element from the list : "+l1.lastIndexOf("a"));
		
		
	
	}
	
	
	
	private static void getTypesTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("element");
	    	
	
		System.out.println("get element from the list at specified index : "+l1.get(2));
		
		//getFirst
		System.out.println("get first element from the list : "+l1.getFirst());
		
		//getLast
	    System.out.println("get first element from the list : "+l1.getLast());
	
	}
	
	
	
	private static void elementTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("head");
		l1.add("a");
		l1.add("x");
		l1.add("element");
		
	
		System.out.println("head of the list : "+l1.element());
	
	}
	
	
	
	private static void descendingIteratorTest() {
		LinkedList l1 = new LinkedList();
		
		
		l1.add("h");
		l1.add("a");
		l1.add("x");
		l1.add("element");
		
		System.out.println("regular iteration : "+l1);
		
		Iterator i = l1.descendingIterator();
		
		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
		
		
		
	}
	
	
	
	private static void containsTest() {
		LinkedList l1 = new LinkedList();
		
		
		// add test 
		
		l1.add(1);
		l1.add("a");
		l1.add('x');
		l1.add(3, "element");
		
		System.out.println(l1);
		
		boolean x = l1.contains("element");
		
		System.out.println("after contains method call : " + x);
		
	}
	
	
	
	private static void clearTest() {
		LinkedList l1 = new LinkedList();
		
		
		// add test 
		
		l1.add(1);
		l1.add("a");
		l1.add('x');
		l1.add(3, "element");
		
		System.out.println("add : "+l1);
		
		l1.clear();
		
		System.out.println("after clear method call : " + l1);
		
	}
	
	
	private static void addTypesTest() {
		LinkedList l1 = new LinkedList();
		
		
		// add test 
		
		l1.add(1);
		l1.add("a");
		l1.add('x');
		l1.add(3, "element");
		
		System.out.println("add : "+l1);
		
		// addAll test 
		
		LinkedList l2 = new LinkedList();
		
		l2.add("p");
		l2.add("q");
		l2.add("r");
		l2.add("s");
		l2.addAll(l1);
		
		System.out.println("addAll : "+ l2);
		
        LinkedList l3 = new LinkedList();
		
		l3.add(1);
		l3.add(2);
		l3.add(3);
		l3.add(4);
		l3.addAll(2, l2);
		
		System.out.println("addAll at index : "+l3);
		
		
		//addFirst
		
		l1.addFirst("first");
		System.out.println("addFirst : "+l1);
		
		
		//addLast
		
		l1.addLast("last");
		System.out.println("addLast : "+l1);
		
		
	}

	
	
	
	
	
}
