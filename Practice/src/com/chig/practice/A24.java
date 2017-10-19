package com.chig.practice;

/**
 * Decimal To Binary, Decimal To Octal And Decimal To HexaDecimal In Java
   Write a java program to convert decimal to binary, decimal to octal and decimal to hexadecimal.
 * */
public class A24 {
	public static void main(String[] args) {
		int number = 2000;
		decimalToBinary(number);
		decimalToOctal(number);
		decimalToHexaDecimal(number);
	}

	private static void decimalToBinary(int number) {
		String binary = "";
		while(number > 0){
			int remainder = number%2;
			binary = binary + remainder;
			number = number / 2;
		}
		System.out.println(binary);
	}
	
	private static void decimalToOctal(int number) {
		String octal = "";
		while(number > 0){
			int remainder = number%8;
			octal = octal + remainder;
			number = number / 8;
		}
		System.out.println(octal);
	}
	
	private static void decimalToHexaDecimal(int number) {
		String hexa = "";
		char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(number > 0){
			int remainder = number%16;
			hexa = hexaDecimals[remainder] + hexa;
			number = number / 16;
		}
		System.out.println(hexa);  
	}
}
