package com.chig.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

public class ListIteratorCursor {
	
	public static void main(String[] args) {
		
		ArrayList c = new ArrayList<>();
		
		
		
		c.add("q");
		c.add("b");
	//	c.add(1, "abc");
		c.add("c");
		
		ListIterator iterator = c.listIterator();
		
		while(iterator.hasNext()) {
			String s = (String)iterator.next();
			
			if(s.equals("b")) {
				iterator.set("bbbbb");
				iterator.add("wwwwww"); //add the element in next position to current pos.and remain elements shifts to next positions as well.
				iterator.previous(); // return back previous poistion
				iterator.previous();
			} else {
				System.out.println(s);
			}
			
		}
		
	}

}
