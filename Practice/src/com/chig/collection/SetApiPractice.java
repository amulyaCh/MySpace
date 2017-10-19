package com.chig.collection;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class SetApiPractice {
	public static void main(String[] args) {

		//addTest();
		//clearTest();
		//containsTest();
		//equalsTest();
		//hashCodeTest();
		//isEmptyTest();
		//iteratorTest();
		//removeTest();
		//retainAllTest();
		
		
	}
	
	private static void retainAllTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("chigurupati");
		
		Set<String> set1 = new HashSet<String>();
		 
		boolean x= set.isEmpty();
		boolean y= set1.isEmpty();
		
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	private static void removeTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("chigurupati");
		
		set.remove("a");
		
		System.out.println(set);
	}
	
	
	
	private static void iteratorTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("chigurupati");
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
	}

	
	private static void isEmptyTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		
		Set<String> set1 = new HashSet<String>();
		 
		boolean x= set.isEmpty();
		boolean y= set1.isEmpty();
		
		System.out.println(x);
		System.out.println(y);
	}
	
	
	private static void hashCodeTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		
        Set<String> set1 = new HashSet<String>();
		
		set1.add("a");
		
		if( set.hashCode() == set1.hashCode()){
			System.out.println(true); 
			
		}else
		System.out.println("false");
	}
	
	
	
	
	/** Returns true if the specified object is also a set,
	 *  the two sets have the same size, and every member of the specified set is contained in this set */
	private static void equalsTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		
		boolean x = set.equals(set);
		System.out.println(x);
	}
	
	
	
	
	private static void containsTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		
		boolean x = set.contains("amulya");
		System.out.println(x);
	}
	
	
	
	private static void clearTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
	}
	
	private static void addTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("amulya");
		
		System.out.println(set);
	}
}
