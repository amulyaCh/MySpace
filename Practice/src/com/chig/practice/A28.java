package com.chig.practice;

/**
 * Reverse the string with preserving the position of spaces
   Write a java program to reverse a string with preserving the position of spaces. 
   For example, if “I Am Not String” is the given string then the reverse of this string with preserving the position of spaces 
   is “g ni rtS toNmAI”.
    
 * */
public class A28 {
public static void main(String[] args) {
	String ex = "I Am Not String";
	char[] array =  ex.toCharArray();
    char[] reverseArray = new char[array.length];
    for(int i =0 ;i<array.length;i++)
    {
    	if(array[i] == ' '){
    		reverseArray[i] = ' ';
    	}
    }
    int j = reverseArray.length-1;
    for(int k =0 ;k<array.length;k++){
    	if(array[k] != ' '){
    		if(array[j] == ' '){
    			j--;
    		}
    		reverseArray[j]=array[k];
    		j--;
    	}
    }
    	System.out.print (String.valueOf(reverseArray));
}
}
