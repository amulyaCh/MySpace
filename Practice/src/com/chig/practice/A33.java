package com.chig.practice;
/**
 * String immutable program
   Write a java program to prove strings are immutable in java.
   That means now both s1 and s2 are pointing to two different objects in the pool.
   Before modifications they are pointing to same object. Once we tried to change the content of the object using ‘s1’, a new object
   is created in the pool with “JAVAJ2EE” as it’s content and it’s reference is assigned to s1. If the strings are mutable,
   both s1 and s2 should point to same object even after modification. That never happened here. That proves the string objects are 
   immutable in java.
 * */
public class A33 
{
	public static void main(String[] args) 
	{
      String s1 = "ABCD";
      String s2 = "ABCD";
      if(s1 == s2){
    	  System.out.println("true");
      }else{
    	  System.out.println("false");
      }
      s1 = s1 + "EFGH";
      if(s1 == s2){
    	  System.out.println("true");
      }else{
    	  System.out.println("false");
      }
	}
}
