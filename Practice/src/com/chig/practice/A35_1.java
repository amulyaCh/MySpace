package com.chig.practice;

import java.util.ArrayList;

/**
 * 18 Java ArrayList Programming Examples
 * */
public class A35_1 {
	public static void main(String[] args) {
		constructionWays3();
	}
	
	/**
	 * Explain the different ways of constructing an ArrayList?
       ArrayList can be created in 3 ways.
       a) ArrayList() —> It creates an empty ArrayList with initial capacity of 10.
       b) ArrayList(int initialCapacity) —> It creates an empty ArrayList with supplied initial capacity.
       c) ArrayList(Collection c) —> It creates an ArrayList containing the elements of the supplied collection.
	 * */
    private static void constructionWays3(){
    	ArrayList<Integer> list1 = new ArrayList<Integer>();
    	ArrayList<Integer> list2 = new ArrayList<Integer>(15);
    	ArrayList<Integer> list3 = new ArrayList<Integer>(list2);
    	System.out.println(list1.size());
    	System.out.println(list2.size());
    	System.out.println(list3.size());
     	
    }
}
