package com.chig.practice;



/** 
   How to find continuous sub array whose sum is equal to given number?

   Write a java program to find continuous sub array of the given array whose sum is equal to a given number.
   For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find continuous
   sub array in this array such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array whose elements 
   add up to 45.

 * */

public class A15 {
	public static void main(String[] args) {
		continiousSubArray1();
		int[] array1 = {42, 15, 12, 8, 6, 32};
		int sum = 26;
		continiousSubArray2(array1,sum);
	}

	private static void continiousSubArray1() {
		int[] array = {42, 15, 12, 8, 6, 32};
		int sum = 26;
		int start = 0;
		int final_sum = array[0];
		for(int i = 1 ; i<array.length;i++)
		{

			final_sum = final_sum + array[i];
			while(final_sum > sum && start <= i-1){
				final_sum = final_sum - array[start];
				start++;
			}
			if(final_sum == sum)
			{
				System.out.println("sum :"+final_sum);
				System.out.println("array elements: ");
				for(int j = start ;j<=i;j++)
				{
					System.out.print(array[j] + " " );
				}
				System.out.println();
			}

		}

	}


	private static void continiousSubArray2(int[] array,int sum)
	{
		int final_sum = 0;
		for(int i =0;i<array.length;i++)
		{
			final_sum = array[i];
			for(int k = i+1 ; k<array.length;k++)
			{
				final_sum = final_sum + array[k];

				if(final_sum == sum)
				{
					System.out.println("sum :"+sum);
					System.out.println("the array of elements are : ");
					for(int j = i ; j<=k;j++)
					{
					
						System.out.print(array[j] + " ");
					}
				}

				else if(final_sum < sum)
				{
					continue;
				}
				else if(final_sum > sum)
				{
					break;
				}
			}
		}
	}



}
