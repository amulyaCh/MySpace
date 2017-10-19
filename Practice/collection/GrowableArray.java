package com.chig.collection;

import java.util.ArrayList;

public class GrowableArray {
	
	public static void main(String[] args) {
		
		int a=10;
		float b= 10.4f;
		String aa= "hello";
		boolean result = false;
		
		ArrayList e = new ArrayList();
		//e.add(a) == (e[i]=a)
		e.add(aa);
		e.add(a);
		e.add(b);
		e.add(result);
		
		//e.size() ==  e.length
		for(int i=0;i<=e.size(); i++) 
		{
			//e.get(i) == e[i];
			System.out.println(e.get(i));
		}
	}

}
