package com.chig.collection;

import java.util.TreeSet;

public class TreeSetApiTest {


	public static void main(String[] args) 
	{


		//celingTest();
		//floorTest();
		//headSetTest();
		//tailSetTest();
		//higherTest();
		//lastTest();
		//lowerTest();
	}

	
	
	private static void lowerTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("lower : "+ts.lower(4));
	}
	
	
	private static void lastTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("last : "+ts.last());
	}
	
	
	private static void higherTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("higher : "+ts.higher(4));
	}
	
	private static void tailSetTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("tailSet : "+ts.tailSet(4));
	}
	
	
	private static void headSetTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("headSet : "+ts.headSet(4));
	}

	
	

	private static void floorTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("floor : "+ts.floor(3));
	}

	private static void celingTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(4);
		ts.add(7);
		ts.add(0);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		ts.add(5);

		System.out.println("ceiling : "+ts.ceiling(3));
	}

}

