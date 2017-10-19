package com.chig.practice;

/** 
 * How to check whether given number is binary or not?
   Write a java program to check whether given number is binary or not. 
   A binary number is a number which contains only 0 or 1. For example : 101101, 110010110, 10010011 are binary numbers.
 * */
public class A17 
{
	public static void main(String[] args) 
	{
      System.out.println(isBoolen());
	}

	private static boolean isBoolen() {
		int number = 101;
		int copyOfNumber = number;
		  while( copyOfNumber != 0){
			  if(copyOfNumber % 10 > 1){
				  return false;
			
			  }
			  copyOfNumber = copyOfNumber / 10;
		  }
		  return true;
	}
}
