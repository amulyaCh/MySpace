package com.chig.practice;

import java.util.Arrays;

/**
 * How to separate zeros from non-zeros in an array?
   Write a java program to separate zeros from non-zeros in the given array.
   You have to move zeros either to end of the array or bring them to beginning of the array. 
   For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} 
   and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.
 * */
public class A23 {
public static void main(String[] args) {
	int[] arr =  {14, 0, 5, 2, 0, 3, 0};
	int counter = 0;
	for(int i=0;i<arr.length;i++){
		if(arr[i] != 0){
			 arr[counter]=arr[i];
			 counter++;
		}
	}
	while(counter < arr.length){
		arr[counter] = 0;
		counter++;
	}
	
	System.out.println(Arrays.toString(arr));
}
}
