package com.chig.practice;

import java.text.DecimalFormat;




/**
 * percentage of uppercase, lowercase, digits and special characters in a string
   Write a java program to find the percentage of uppercase letters, lowercase letters, digits and other special characters(including space)
   in the given string.
 * */
public class A30 {
	public static void main(String[] args) {
		String sentence = "Tiger Runs @ The Speed Of 100 km/hour.";
		char[] s = sentence.toCharArray();
		int u = 0,l = 0, d = 0, spl = 0;
		for(char i : s){
			if(Character.isUpperCase(i)){
				u += 1;
			}else if(Character.isLowerCase(i)){
				l += 1;
			}else if(Character.isDigit(i)){
				d += 1;
			}else{
				spl += 1;
			}
		}
		
		int totalChars = sentence.length();
		System.out.println("Total Length of a given String including spaces :" + totalChars);
		double percentage_of_upperCase = ((u*100.0)/totalChars);
		double percentage_of_lowerCase = ((l*100.0)/totalChars);
		double percentage_of_Digits = ((d*100.0)/totalChars);
		double percentage_of_specialcharacters = ((spl*100.0)/totalChars);
		DecimalFormat formatter = new DecimalFormat("##.##"); 
        System.out.println("percentage_of_upperCase :" + formatter.format(percentage_of_upperCase)+"%");
        System.out.println("percentage_of_lowerCase :" + formatter.format(percentage_of_lowerCase)+"%");
        System.out.println("percentage_of_Digits :" + formatter.format(percentage_of_Digits)+"%");
        System.out.println("percentage_of_specialcharacters :"+formatter.format(percentage_of_specialcharacters)+"%");
	}
}
