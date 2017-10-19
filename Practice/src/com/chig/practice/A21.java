package com.chig.practice;

/**
 * How to find trigonometric values of an angle in java?
   Write a java program to find trigonometric values like sin, cos, tan, sec, cosec and cot of an angle. 
   Here is how we find out trigonometric values of an angle using methods of Math class.

1) sine of an angle  —> Math.sin();

2) cosine of an angle —> Math.cos();

3) tangent of an angle —> Math.tan();

4) sec of an angle —> 1/Math.sin();

5) cosec of an agnle —> 1/Math.cos();

6) cot of an angle —> 1/Math.tan();
 * */
public class A21 {
public static void main(String[] args) {
	double angle = 90;
	double angleInRadians = Math.toRadians(angle);
	double sinOfAngle = Math.sin(angleInRadians);
	double cosOfAngle = Math.cos(angleInRadians);
	double tanOfAngle = Math.tan(angleInRadians);
	double secOfAngle = 1/Math.sin(angleInRadians);
	double cosecOfAngle = 1/Math.cos(angleInRadians);
	double cotOfAngle = 1/Math.tan(angleInRadians);
	
 
	System.out.println("sinOfAngle :"+sinOfAngle);
	System.out.println("cosOfAngle :"+cosOfAngle);
	System.out.println("tanOfAngle :"+tanOfAngle);
	System.out.println("secOfAngle :"+secOfAngle);
	System.out.println("cosecOfAngle :"+cosecOfAngle);
	System.out.println("cotOfAngle :"+cotOfAngle);
	
	
	
}
}
