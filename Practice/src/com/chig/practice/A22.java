package com.chig.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * How to reverse each word of a string in java? Write a java program to reverse
 * each word of a given string. For example, If “Java Concept Of The Day” is
 * input string then output should be “avaJ tpecnoC fO ehT yaD”.
 */
public class A22 {
	public static void main(String[] args) {
		reverseString1();
		reverseString2();
		reverseString3();
		reverseString4();

	}

	private static void reverseString1() {
		String rev = "Java Concept Of The Day";
		StringBuilder sb = new StringBuilder();
		sb.append(rev);
		sb = sb.reverse();
		for (int j = 0; j < sb.length(); j++) 
		{
			System.out.print(sb.charAt(j));
		}
		System.out.println(" ");
	}
	
	private static void reverseString2() {
		String input = "Java Concept Of The Day";
		byte[] byteArray = input.getBytes();
		byte[] rev = new byte[byteArray.length];
		for(int i = 0;i<=byteArray.length-1;i++){
		rev[i] = byteArray[byteArray.length-i-1];	
		}
	    System.out.println(new String(rev));
	}
	
	private static void reverseString3() {
		String input = "Java Concept Of The Day";
		char[] rev = input.toCharArray();
		for(int i = input.length()-1;i>=0;i-- ){
			System.out.print( rev[i]);
		}
		System.out.println();
	}
	
	private static void reverseString4() {
		String input = "Java Concept Of The Day";
		char[] rev = input.toCharArray();
		List<Character> list = new ArrayList<>();
		for(char c : rev){
			list.add(c);
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
        	System.out.print(iterator.next());
        }
	}
}
