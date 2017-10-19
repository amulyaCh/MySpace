package com.chig.practice;


/**
 *  How to find all the leaders in an integer array in java?
    Write a java program to find all the leaders in an integer array. 
    An element is said to be a leader if all the elements on it’s right side are smaller than it. 
    Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then 
    {14, 11, 8, 5, 3} are the leaders in this array.
 * */
public class A25 
{
	public static void main(String[] args) 
	{
		int[] arr = {14, 9, 11, 7, 8, 5, 3};
		int max = arr[arr.length -1];
		System.out.println(max);
		int[] temp = new int[arr.length]; 
		for(int i = arr.length-2;i >= 0 ; i--){
			if(arr[i] > arr[0]){
				break;
			}else if(arr[i] > max){
				System.out.println(arr[i]);
				max = arr[i];
			}
		}
	}
}
