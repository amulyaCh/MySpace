package com.chig.collection;

import java.util.HashSet;

public class HashSetConcept {
     public static void main(String[] args) {
		HashSet  e = new HashSet();
		
		e.add('e');
		e.add('f');
		e.add('t');
		e.add("blue");
		e.add('a');
		e.add('b');
		e.add(null);
		

		
		
		for(Object c : e) {
			System.out.println(c);
		}
	}
}
