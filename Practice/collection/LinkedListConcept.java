package com.chig.collection;

import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		
		a.add(1);
		a.add("a");
		a.add(false);
		
		for(int i=0;i<a.size(); i++) 
		{
			System.out.println(a.get(0));
		}
	}

}
