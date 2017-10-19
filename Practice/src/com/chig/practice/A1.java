package com.chig.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		//		reverseString("1234567890");
		//		reverseStringBuffer("abcdefg");
		//		System.out.println(reverseStringReccursive("abcdefg"));
	}
	private static void reverseString(String x){
		for(int i=x.length()-1 ; i>=0;i--){
			System.out.print(x.charAt(i));
		}

	}

	private static void reverseStringBuffer(String x){
		StringBuffer sb = new StringBuffer(x);
		System.out.println(sb.reverse());
	}


	private static String reverseStringReccursive(String x){

		if(x.length() == 0 || x.length() ==1){
			return x;
		}
		return reverseStringReccursive(x.substring(1)) + x.charAt(0);

	}

}

class A2{
	public static void main(String[] args) {
		//pyramid1(5);
		//pyramid2(5);
		//pyramid3(5);
		pyramid4(5);
	}	

	/** 
	  1     
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5    */

	private static void pyramid1(int a)
	{
		for(int i=1;i<=a;i++){

			for(int k=i;k<=a;k++){
				System.out.print(" ");
			}

			for(int j=1 ;j<=i;j++)
			{

				System.out.print(" "+i);
			}
			System.out.println();
		}
	}



	/** 
      1
     1 2
    1 2 3
   1 2 3 4
  1 2 3 4 5   */	
	private static void pyramid2(int a)
	{
		for(int i=1;i<=a;i++){

			for(int k=i;k<=a;k++){
				System.out.print(" ");
			}

			for(int j=1 ;j<=i;j++)
			{

				System.out.print(" "+j);
			}
			System.out.println();
		}
	}



	/** 

	 *
	 * *
	 * * *
	 * * * *
	 * * * * *

	 */

	private static void pyramid3(int a)
	{
		for(int i=1;i<=a;i++){

			for(int k=i;k<=a;k++){
				System.out.print(" ");
			}

			for(int j=1 ;j<=i;j++)
			{

				System.out.print(" *");
			}
			System.out.println();
		}
	}


	/**

           1
         1 2 1
       1 2 3 2 1
     1 2 3 4 3 2 1
   1 2 3 4 5 4 3 2 1


	 */


	private static void pyramid4(int a)
	{
		for(int i=1;i<=a;i++){			
			for(int k=i;k<=a;k++){
				System.out.print(" "+" ");
			}			
			for(int j=1 ;j<=i;j++)
			{			
				System.out.print(" "+j);				
			}

			for(int l=i;l>1;l--)	
			{
				System.out.print(" "+ (l-1) );
			}
			System.out.println();
		}
	}	




	private static void pyramid5(int a)
	{
		for(int i=1;i<=a;i++){			
			for(int k=i;k<=a;k++){
				System.out.print(" "+" ");
			}			
			for(int j=1 ;j<=i;j++)
			{			
				System.out.print(" "+j);				
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(" "+l);
			}
			System.out.println();
		}
	}	
}	
/**  How do you remove all white spaces from a string in java? */

class A3
{
	public static void main(String[] args) 
	{
		//whiteSpacesReplaceAll(" abc def ");
		whiteSpacesWithoutReplaceAll(" abc def ");
	}
	private static void whiteSpacesReplaceAll(String x)
	{
		System.out.println("x : "+x);
		String y = x.replaceAll("\\s", "");
		System.out.print("y : "+y);
	}


	private static void whiteSpacesWithoutReplaceAll(String x) {
		StringBuffer sb = new StringBuffer();
		char[] ch = x.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (x.charAt(i) != ' ') 
			{
				sb.append(x.charAt(i));
			}
		}
		System.out.println("string is : "+sb);
	}
}

class A4
{
	public static void main(String[] args) 
	{
		duplicatesInAString("aaabb");
	}
	private static void duplicatesInAString(String x)
	{	
		for(int i=0;i<x.length();i++)
		{	   
			int count=1;
			char ch = x.charAt(i);    		   
			if(x.substring(0,i).contains(ch+""))
			{
				continue;
			}
			for(int j=i+1;j<x.length();j++)
			{	
				if(ch == x.charAt(j))
				{
					count++;
				}
			}
			System.out.println(ch + " repeated " + count);
		}
	}

}


/** How do you check the equality of two arrays in java?
        Write a java program to check the equality of two arrays using different methods. */
class A5
{
	public static void main(String[] args)
	{
		Object[] a = {1,2,3,4};
		Object[] b = {1,2,3,4};
		//System.out.println(isArrayEqual1(a,b));

		int[] x = {1,2,3,4};
		int[] y = {1,2,3,4};
		//System.out.println(isArrayEqual2(x,y));
	}
	private static boolean isArrayEqual1(Object[] a,Object[] b){

		// a == b will return false ; so use deepEquals fuction which checks properly.
		if(Arrays.deepEquals(a, b) && Arrays.equals(a, b)){
			return true;
		}

		return false;
	}


	private static boolean isArrayEqual2(int[] a,int[] b)
	{	
		boolean x =true;
		if(a.length == b.length)
		{				
			for(int i=0;i<a.length;i++)
			{        	
				if(a[i] != b[i])
				{
					return x;
				}             	
			}
		}           
		return false;
	}		
}

class A6{
	public static void main(String[] args) {

		isAnagramUsingMethods("Mother In Law","Hitler Woman");
		isAnagramWithoutUsingMethods("Mother In Law","Hitler Woman");
		isAnagramWithoutUsingStringBulder("Mother In Law","Hitler Woman");
		isAnagramWithoutUsingStringBulder("Mother In Law","Hitler Woman");
	}
	private static void isAnagramUsingMethods(String x,String y){

		String a = x.replaceAll("\\s", "");
		String b = y.replaceAll("\\s", "");

		char[] p = a.toLowerCase().toCharArray();
		char[] q = b.toLowerCase().toCharArray();

		System.out.println(p);
		System.out.println(q);

		if(p.length == q.length)
		{
			System.out.println("length of two strings is equal.");
		}

		Arrays.sort(p);	
		Arrays.sort(q);

		System.out.println();
		System.out.println(p);
		System.out.println(q);

		boolean isEqual = Arrays.equals(p, q);
		System.out.println(isEqual);

	}	

	private static void isAnagramWithoutUsingMethods(String x,String y)
	{

	}

	private static void isAnagramWithoutUsingStringBulder(String x,String y)
	{

	}
	private static void isAnagramWithoutUsingHashmap(String x,String y)
	{

	}
}


class A7
{
	public static void main(String[] args) 
	{
		//isAmstrongUsingMethod(153);
		isAmstrongIterative(153);
	}
	private static void isAmstrongUsingMethod(int x) 
	{
		int temp =0,sum=0;
		int copy = x;
		int y = String.valueOf(x).length();
		while(copy != 0)        	
		{
			temp = copy%10;   	  
			sum = sum + (int)(Math.pow(temp , y));
			copy = copy/10;       	  
		}
		System.out.println("sum : " +sum);
		if(sum == x)
		{
			System.out.println(x+" is a Palindrome.");
		}
		else
		{
			System.out.println(x+" is not a Palindrome.");
		}
	}


	private static void isAmstrongIterative(int x)       
	{
		int copy = x; 
		int sum=0; 
		int length = String.valueOf(x).length();
		while(copy!=0)
		{
			int lastDigit = copy%10;
			int sumOfEachDigit = 1;
			for(int i = 0; i<length;i++)
			{
				sumOfEachDigit   = sumOfEachDigit * lastDigit;            	
			}              
			copy = copy / 10;
			sum = sum + sumOfEachDigit;          
		}

		System.out.println("total : "+sum);
	}
}

/** How to find duplicate elements in an array? */ 
class A8
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,1,2};
		duplicatesInArray(arr);
	}
	private static void duplicatesInArray(int[] x) 
	{
		for(int i= 0 ;i<x.length;i++){
			for(int j= i+1 ;j<x.length;j++)
			{
				if(x[i] == x[j] && i!=j)
				{
					System.out.println("duplicates are :"+x[i]);
				}	        		
			}
		}    			
	}
}

/** How to find sum of all digits of a number in java? */
class A9
{
	public static void main(String[] args) 
	{
		//iterative
		sumOfAllDigitsInNumber(123456);

		//recursive
		A9 a = new A9();
		System.out.println(a.sumOfAllDigitsInNumberRecursive(123456));
	}
	private static void sumOfAllDigitsInNumber(int x) 
	{
		int copy = x,sum = 0;
		while(copy!= 0){
			int individualNumber = copy%10;
			sum = sum + individualNumber;
			copy = copy/10;
		}
		System.out.println(sum);
	}


	private static int sumOfAllDigitsInNumberRecursive(int x) 
	{
		int copy = x,sum = 0;
		while(copy!= 0){
			int individualNumber = copy%10;
			sum = sum + individualNumber;
			copy = copy/10;
			sumOfAllDigitsInNumberRecursive(copy);
		}
		return sum;
	}
}






class A10 {
	public static void main(String[] args) 
	{
		//sort and get the second index from last
		int[] arr = {5,1,3,4,2,7,6,12,0,15};
		//secondLargestInArray(arr); 

		// iterative method 
		System.out.println(secondLargestInArrayIterative(arr));
	}

	private static void secondLargestInArray(int[] arr) 
	{
		Arrays.sort(arr);
		int y = arr.length;
		int x[] = arr;
		System.out.println(x[y - 2]);

	}

	private static int secondLargestInArrayIterative(int[] arr) 
	{
		int firstBig =0 ,secondBig = 0;
		if(arr[0] < arr[1])
		{
			firstBig = arr[1];
			secondBig = arr[0];
		}
		else 
		{
			firstBig = arr[0];
			secondBig = arr[1];
		}

		for(int i=2 ; i<arr.length ; i++)
		{
			if(arr[i] > firstBig){
				secondBig = firstBig;
				firstBig = arr[i];

			}
			else if(arr[i] < firstBig && arr[i] > secondBig)
			{
				secondBig = arr[i];
			}
		}
		return secondBig;
	}
}



/** 
	   How to perform matrix operations in java? 
	   Write a java program to perform matrix operations like matrix addition, matrix subtraction, matrix multiplication 
	   and transpose of a matrix.
 */
class A11{
	public static void main(String[] args) 
	{
		//matrixCreation();

		/** It is same for substraction , multiplication , division */
		//matrixAddition();

		matrixTranspose();
	}

	private static void matrixCreation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("enter no of columns : ");
		int columns = sc.nextInt();

		int[][] matrix1 = new int[rows][columns];
		System.out.println("Enter matrix data : ");
		for(int i= 0 ; i <rows;i++ ){
			for(int j =0 ;j<columns ; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("matrix you entered : ");

		for(int i= 0 ; i <rows;i++ ){
			for(int j =0 ;j<columns ; j++){
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}


	private static void matrixAddition()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("enter no of rows : ");
		int r = sc.nextInt();
		System.out.print("enter no of columns : ");
		int c = sc.nextInt();
		int[][] matrix1 = new int[r][c];
		System.out.println("Enter matrix data : ");
		for(int i= 0 ; i <r;i++ )
		{
			for(int j =0 ;j<c ; j++)
			{
				matrix1[i][j] = sc.nextInt();
			}
		}

		int[][] matrix2 = new int[r][c];
		System.out.println("Enter matrix data : ");
		for(int i= 0 ; i <r;i++ )
		{
			for(int j =0 ;j<c ; j++)
			{
				matrix2[i][j] = sc.nextInt();
			}
		}


		System.out.println("first matrix you entered : ");

		for(int i= 0 ; i <r;i++ )
		{
			for(int j =0 ;j<c ; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("second matrix you entered : ");
		for(int i= 0 ; i <r;i++ )
		{
			for(int j =0 ;j<c ; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		int[][] result = new int[r][c]; 

		System.out.println("Addition of two matrixes is  : ");
		for(int i= 0 ; i <r;i++ )
		{
			for(int j =0 ;j<c ; j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}


	private static void matrixTranspose()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("enter no of columns : ");
		int columns = sc.nextInt();
		int[][] matrix1 = new int[rows][columns];
		System.out.println("Enter matrix data : ");
		for(int i= 0 ; i <rows;i++ ){
			for(int j =0 ;j<columns ; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("matrix you entered : ");
		for(int i= 0 ; i <rows;i++ ){
			for(int j =0 ;j<columns ; j++){
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		int[][] transposeMatrix = new int[columns][rows];
		System.out.println("Transpose of matrix you entered : ");		
		for(int i= 0 ; i <rows;i++ )
		{
			for(int j =0 ;j<columns ; j++)
			{
				transposeMatrix[j][i] = matrix1[i][j];
			}
		}
		for(int i= 0 ; i<columns;i++ )
		{
			for(int j =0 ;j<rows ; j++)
			{
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}		



/** How to count occurrences of each character in a string in java?
        Write a java program to count the number of occurrences of each character in a given string. 
        For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of each character in this string is
        E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5. 
 */	

class A12{
	public static void main(String[] args)
	{
		String s = "AllIsWell";
		characterOccurrencesCount(s);	
	}
	private static void characterOccurrencesCount(String s){
		HashMap<Character , Integer> count = new HashMap<Character , Integer>() ;

		char[] x = s.toCharArray();

		for(char c : x){
			if(count.containsKey(c)){
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}
}


/** How To Find Largest Number Less Than Given Number And Without Given Digit?
            Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not contain a given digit ‘D’.
            For example, If 145 is the given number and 4 is the given digit, then you should find the largest number less than 145 such that
            it should not contain 4 in it. In this case, 139 will be the answer.
 */
class A13{
	public static void main(String[] args) 
	{
		System.out.println(numberLessThanN(145,4));
	}
	private static int numberLessThanN(int n,int d)
	{
		char dig = Integer.toString(d).charAt(0);
        
 		for(int i = n; i>0; i--)
		{
			if(Integer.toString(i).indexOf(dig) == -1){
				return i;
			}
			
		}
 		return -1;
	}
}






















