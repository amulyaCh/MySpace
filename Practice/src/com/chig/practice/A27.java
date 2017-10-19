package com.chig.practice;

/**
 * Selection sort in java.
   Write a java program to implement selection sort.
 * */
public class A27 {
	public static void main(String[] args) {
		int[] array =  {45, 84, 101, 62, 12, 45};
		selectionSort(array);
	}
	private static void selectionSort(int[] array)
	{
		int temp,pos;
		for(int i = 0;i<array.length-1;i++)
		{
			pos = i;
			for(int j= i+1;j<array.length;j++)
			{
				if(array[j] < array[pos])
				{
					pos=j;
				}
			}
			temp = array[i];
			array[i] = array[pos];
			array[pos] = temp;	
		}

		for(int k = 0;k<array.length;k++){
			System.out.print(array[k] + " ");
		}
	}
}
