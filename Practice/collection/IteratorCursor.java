package com.chig.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {
	
	public static void main(String[] args) {
		
		ArrayList e = new ArrayList<>();
		
		e.add("1");
		e.add("2");
		e.add("abd");
		
		Iterator iterable = e.iterator();
		
		while(iterable.hasNext()) {
			String s = (String)iterable.next();
			if(s.equals("1")) {
				iterable.remove();
			}
		}
		
		iterable = e.iterator();
		while(iterable.hasNext()) {
			System.out.println(iterable.next());
		}
	}

}
