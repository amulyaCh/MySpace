package com.chig.practice;
/**
 * Find missing number in an array
   If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements from 1 to n. 
   Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once.
   If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}. 
   One number will be missing in ‘a’ (2 in this case). You have to find out that missing number. 
 * */
public class A32 {
	public static void main(String[] args) {
		int[] array = {1, 4, 5, 3, 7, 8, 6};
		int n = 8;
		missingNumber(array, n);
	}
	private static void missingNumber(int[] array,int n){

		int arraySum =0;
		//sum of n elements. 
		int sum = (n*(n+1)) / 2;

		//sum of array elements.
		for(int i =0;i<array.length;i++)
		{
			arraySum += array[i]; 
		}

        //find the missing element.
		int missingElement;
		missingElement = sum - arraySum;
		System.out.println("the missing element in the array is :" + missingElement);
	}
}
