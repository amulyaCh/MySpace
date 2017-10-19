package com.chig.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListApiPractice {
	public static void main(String[] args) {
		//addTest();
		//addAtIndex();
		//addAllTest();
		//addAllIndex();
		//clearTest();
		//containsTest();
		//ensureCapacityTest(5); 
		//getTest(2);
		//indexOfTest("c");
		//isEmptyTest();
		//lastIndexOfTest("c");
        //listIteratorTest();
		//removeAllTest();
		//subListTest();
		//setTest();
		//sizeTest();
		//toArrayTest();
		
		//Java 8 : forEach    removeIf(Predicate<? super E> filter)   sort(Comparator<? super E> c)   spliterator()
		
	}
	/** toArray will convert the list to array so that we can access it by index values.*/
	private static void toArrayTest() {

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		ar.add("c");
		
		System.out.println(ar);
		
		String[] x = new String[ar.size()];
	    x = ar.toArray(x);
		
	    for(int i=0;i<x.length;i++){
	    	System.out.println(x[i]);	
	    }
		
		
	}
	
	private static void sizeTest() {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		ar.add("c");
		
	    int x = ar.size();  
		
	    
		System.out.println(x);
		
	}
	
	private static void setTest() {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		ar.add("c");
		
	    ar.set(0,"x");  
		
	    
		System.out.println(ar);
		
	}
	

	private static void subListTest() {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		ar.add("c");
		
		List a = ar.subList(0,2);  //last index exclusive.  [0,n-1]
		
		System.out.println(a);
	}
	
	
	private static void removeAllTest() {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		ar.add("c");

		ListIterator ll =  ar.listIterator();
		
		while(ll.hasNext()){
			String s = (String)ll.next();
			System.out.println(s);
		}

        
		ar.removeAll(ar);
		
        ListIterator ll2 =  ar.listIterator();
		
		while(ll2.hasNext()){
			String s = (String)ll2.next();
			System.out.println(s);
		}
        		


	}
	

	private static void listIteratorTest() {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		ar.add("c");

		ListIterator ll =  ar.listIterator();
		
		while(ll.hasNext()){
			String s = (String)ll.next();
			System.out.println(s);
		}


	}



	private static boolean isEmptyTest() {

		ArrayList ar = new ArrayList();

		//			ar.add("a");
		//			ar.add("b");
		//			ar.add("c");  
		//			ar.add("d");  

		System.out.println(ar.isEmpty());	
		return ar.isEmpty();

	}


	private static int indexOfTest(String x) {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  

		int a = ar.indexOf(x);

		System.out.println(a);

		return a;

	}



	private static String getTest(int x) {

		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  

		String a = (String)ar.get(x);

		System.out.println(a);

		return a;

	}


	private static void ensureCapacityTest(int minCapacity) {
		ArrayList ar = new ArrayList();


		ar.ensureCapacity(minCapacity);
		System.out.println(ar.size());

	}




	private static boolean containsTest() {
		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  

		if(ar.contains("a")){  // we do not need iterator unlike arrays.
			System.out.println("true");
			return true;	
		}
		return false;
	}




	private static void clearTest() {
		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("b");
		ar.add("c");  
		ar.add("d");  
		//ar.clear();

		Iterator i = ar.iterator();

		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}

		ar.clear();  //after you empty we have to create anew iterator if you want to print.if you dont do that you are trying to oper the cursor again.

		Iterator i2 = ar.iterator(); // second iterator 

		while(i2.hasNext()){
			String s = (String)i2.next();
			System.out.println(s);
		}
	}

	private static void addAllIndex() {
		//basically it merges two lists.

		ArrayList ar = new ArrayList();

		ar.add(0,"a");
		ar.add(1,"b");
		ar.add(2,"c");  
		ar.add(3,"d");  


		ArrayList ar2 = new ArrayList();

		ar2.add(0,"e");
		ar2.add(1,"f");
		ar2.add(2,"g");  
		ar2.add(3,"h");  
		ar2.addAll(3,ar); //**********check this line.		

		Iterator i = ar2.iterator();

		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
	}

	private static void addAllTest() {
		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("s");
		ar.add("2");  
		ar.add("5");  
		ar.addAll(ar); //**********check this line.

		Iterator i = ar.iterator();

		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
	}



	private static void addAtIndex() {
		ArrayList ar = new ArrayList();

		ar.add(0,"a");
		ar.add(1,"s");
		ar.add(2,"2");  //**********check this and below line it swaps the positions.
		ar.add(2,"5");  //**********

		Iterator i = ar.iterator();

		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
	}

	private static void addTest() {
		ArrayList ar = new ArrayList();

		ar.add("a");
		ar.add("s");
		ar.add("2");

		Iterator i = ar.iterator();

		while(i.hasNext()){
			String s = (String)i.next();
			System.out.println(s);
		}
	}
}

