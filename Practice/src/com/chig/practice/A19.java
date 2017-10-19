package com.chig.practice;

import java.util.Arrays;
import java.util.HashSet;

/**
    How to find intersection of two arrays in java?
    Write a java program to find intersection of two arrays or common elements between the two arrays.
 */
public class A19 
{
	public static void main(String[] args) 
	{
		intersection1();
		intersection2();
		intersection3();

	}

	private static void intersection1() {
		int[] a1 = {1,2,3,4};
		int[] a2 = {3,4,5,6};

		for(int i =0 ;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){

				if(a1[i] == a2[j]){
					System.out.print(a1[i]+" " );
				}
			}
		}
	}


	private static void intersection2() {
		String[] a1 = {"d","a","b","c"};
		String[] a2 = {"d","a","e","f"};
		HashSet<String> hashSet = new HashSet<String>();
		for(int i =0 ;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){

				if(a1[i].equals(a2[j])){
					hashSet.add(a1[i]);
				}
			}
		}
		System.out.println(hashSet);
	}


	private static void intersection3() {
		
		Integer[] a1 = {1, 2, 3, 4, 5, 4};
		 
        Integer[] a2 = {3, 4, 5, 6, 7, 4};
		
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(a1));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(a2));
		set1.retainAll(set2);
		System.out.println(set1);
        		


		
	}
}
