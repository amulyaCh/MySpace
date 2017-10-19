package com.chig.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/** 
 * How to remove duplicate elements from ArrayList in java?
   Write a java program to remove duplicate elements from already constructed ArrayList. 
 * */
public class A16 
{
	public static void main(String[] args) 
	{
       duplicatesInArray1();
       duplicatesInArray2();
       
	}

	private static void duplicatesInArray1() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		   arrayList.add(1);
		   arrayList.add(2);
		   arrayList.add(3);
		   arrayList.add(4);
		   arrayList.add(5);
		   arrayList.add(1);
		   System.out.println(arrayList);
		   
		   LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(arrayList);
		   ArrayList<Integer> array_List = new ArrayList<Integer>(hashSet);
		   System.out.println(array_List);
	}
	
	private static void duplicatesInArray2() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		   arrayList.add(1);
		   arrayList.add(2);
		   arrayList.add(3);
		   arrayList.add(4);
		   arrayList.add(5);
		   arrayList.add(1);
		   System.out.println(arrayList);
		   
		   HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);
		   ArrayList<Integer> array_List = new ArrayList<Integer>(hashSet);
		   System.out.println(array_List);
	}
}
