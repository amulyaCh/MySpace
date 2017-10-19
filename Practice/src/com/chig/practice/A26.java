package com.chig.practice;

import java.util.Scanner;

/**
 * Reverse and add until you get a palindrome
   Write a java program to take input number from the user, reverse it and add it to itself. 
   If the sum is not a palindrome then repeat the procedure until you get a palindrome.
 * */
public class A26 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter a number :");
		int number  = scanner.nextInt();
        reverseAndAdd(number);
	}
	private static int reverse(int number){

		int temp = 0;
		while(number > 0){
			temp = (temp * 10) + (number % 10);
			number = number/10;
		}
//		System.out.println(temp);
		return temp;

	}
	private static boolean isPalindrome(int number){
		int reverseOfNumber = reverse(number); 
		if(reverseOfNumber == number){
			return true;
		}else{
			return false;
		}
	}

	private static void reverseAndAdd(int number){
		if(isPalindrome(number)){
			System.out.println("Given number is already a palindrome :"+number);
		}else{
			while(!isPalindrome(number)){
               int reverseOfNumber= reverse(number);
               int sum = reverseOfNumber + number;
               System.out.println(number + " + "+reverseOfNumber+ " = "+sum);
               number = sum;
			}
		}
	}
}










