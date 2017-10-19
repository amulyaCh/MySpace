package com.chig.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetConcept {
     public static void main(String[] args) {
		TreeSet  e = new TreeSet(Collections.reverseOrder());
		e.add('a');
		e.add('e');
		e.add('f');
		e.add('t');
		e.add('v');
		e.add('a');
		e.add('b');
		e.add('d');
		
		for(Object c : e) {
			System.out.println(c);
		}
	}
}



