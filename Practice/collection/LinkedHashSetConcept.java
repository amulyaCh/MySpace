package com.chig.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetConcept {
     public static void main(String[] args) {
		LinkedHashSet  e = new LinkedHashSet();
		e.add('a');
		e.add('e');
		e.add('f');
		e.add('t');
		e.add("blue");
		e.add('a');
		e.add('b');
		e.add('a');
		
		for(Object c : e) {
			System.out.println(c);
		}
	}
}
