package com.chig.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorCursor {

	public static void main(String[] args) {
		
		Vector v  = new Vector<>();
		v.add("1");
		v.add("2");
		v.add("b");
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
