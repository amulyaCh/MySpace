package com.chig.practice;

/**
 * How to check whether user input is number or not in java?
   Write a java program to check whether user has entered a number or not.
 * */
import java.util.Scanner;

public class A20 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a string:");
		String x = sc.next();
        System.out.println(isInteger(x));
	}

	private static boolean isInteger(String x) {

		try {
			Integer.parseInt(x);
		} catch (NumberFormatException e) {
			return false;
		} finally {
			sc.close();
		}
		return true;
	}
}
