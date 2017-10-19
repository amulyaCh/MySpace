package com.chig.practice;

import java.util.Arrays;

/** 
 * 14) How to find all pairs of elements in an array whose sum is equal to given number?

       Write a java program to find all pairs of elements in the given array whose sum is equal to a given number. 
       For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs
       of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose 
       sum is 20.
 * */
public class A14 {

	public static void main(String[] args) {
		int[] array = {4, 6, 5, -10, 8, 5, 20};
		int sum = 10;
		for(int i = 0 ;i<array.length;i++)
		{
			for(int j = i+1 ;j<array.length;j++)
			{
			   if(array[i] + array[j] == sum)	{
				   System.out.println(array[i] + ", " + array[j]);
			   }
			}
		}
	}
}
