package com.chig.practice;

import java.util.Arrays;

/**
 * Arrays.deepToString() method example.
 * java.util.Arrays class has many useful methods to perform the operations on the arrays. 
 * deepToString() method is one such method. Arrays.deepToString() method is used to get the string representation of multidimensional arrays. 
 * This method returns the deep contents of the specified array. If the specified array contains other arrays as it’s elements then
 * it returns the contents of those arrays also.
 * */
public class A34
{
	public static void main(String[] args) 
	{
      String[] OneD = new String[]{"1","2","3"};
      String[][] TwoD = {{"1","2","3"},{"1","2","3"},{"1","2","3"}};
      String[][][] ThreeD = {{{"1","2","3"},{"1","2","3"}},{{"1","2","3"},{"1","2","3"}},{{"1","2","3"},{"1","2","3"}}};
      
      System.out.println(Arrays.deepToString(OneD));
      System.out.println(Arrays.deepToString(TwoD));
      System.out.println(Arrays.deepToString(ThreeD));
	}
}
