package com.chig.practice;

import java.util.ArrayList;
import java.util.List;


public class A35_2 {
public static void main(String[] args) {
	increaseCapacity();
	decreseCapacity();
	findSize();
	isEmpty();
	containsOrNot();
	position();
	toArray();
	retrieveElement();
	replaceElement();
	addElementAtEnd();
	addAtIndex();
	removeElementAtIndex();
	removeParticular();
	removeAtOnce();
	subListOfElements();
	addTwoLists();
	
}


/**
 * How do you insert more than one element at a particular position of an ArrayList?
   Another version of addAll() method which takes two arguments, one is index and another one is Collection type, can be used for this requirement.
   This method inserts all of the elements of passed collection at a specified position of an ArrayList.
 * */
private static void addTwoListsAtIndex() {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(4);
	list2.add(5);
	list2.add(6);
	
	list1.addAll(2, list2);
	System.out.println(list1);
}

/**
 * How do you join two ArrayLists?
   We can use addAll() method which takes Collection type as an argument to join two ArrayLists. 
   This method appends all elements of the passed collection to the end of the invoking collection.
 * */
private static void addTwoLists() {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(4);
	list2.add(5);
	list2.add(6);
	
	list1.addAll(list2);
	System.out.println(list1);
}


/**
 * How do you retrieve a portion of an ArrayList?
   Using subList() method of ArrayList, we can retrieve a portion of an ArrayList. 
   subList() method returns a view of a portion of an ArrayList in the given range. 
   The returned subList is backed by original ArrayList. That means any changes made to subList will be reflected in original ArrayList or 
   Vice-Versa.
 * */
private static void subListOfElements() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	
	List<Integer> listInt = list.subList(2, 6);
	System.out.println(listInt);
}


/**
 * How do you remove all elements of an ArrayList at a time?
   clear() method removes all elements of an ArrayList. ArrayList will be empty after this method is executed.
 * 
 */
private static void removeAtOnce() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
    list.clear();
	System.out.println(list);
}

/**
 *  How do you remove the given element from an ArrayList?
    remove(Object obj) method removes the first occurrence of the specified element ‘obj‘. 
    If that element doesn’t exist, ArrayList will be unchanged.
 * */
private static void removeParticular() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
    list.remove(2);
	System.out.println(list);
}


/**
 * How do you remove an element from a particular position of an ArrayList?
   remove() method which takes int type as an argument is used to remove an element from a particular position of an ArrayList.
 * */
private static void removeElementAtIndex() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
    list.remove(0);
	System.out.println(list);
}

/**
 * How do you insert an element at a particular position of an ArrayList?
   add() method which takes index and an element as arguments can be used to insert an element at a particular position of an ArrayList.
   The elements at the right side of that position are shifted one position right i.e indices of right side elements of that position are 
   increased by 1.
 * */
private static void addAtIndex() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(3, 4);
	System.out.println(list);
}


/**
 * How do you append an element at the end of an ArrayList?
 * add() method appends an element at the end of an ArrayList.
 * */
private static void addElementAtEnd() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list);
}



/**
 * How do you replace a particular element in an ArrayList with the given element?
   set() method replaces a particular element in an Arraylist with the given element. 
   This method takes two arguments. One is the index of the element to be replaced and another one is the element to be placed at that position.
 * */
private static void replaceElement(){
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list.set(2, 5));
	System.out.println(list);
}

/**
 * How do you retrieve an element from a particular position of an ArrayList?
   get() method returns an element from a specified position of an ArrayList. This method takes index of the element as an argument.
 * */
private static void retrieveElement() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println("retrieve an element from a particular position :"+list.get(2));
}

/**
How do you convert an ArrayList to Array?
Using toArray() method of ArrayList class. toArray() method returns an array containing all elements of the ArrayList. 
This method acts as a bridge between normal arrays and collection framework in java.

*/
private static void toArray() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	Object[] array = list.toArray();
	for(Object ob : array){
		System.out.print(ob +" ");
	}
	System.out.println();
}



/**
 * How do you get the position of a particular element in an ArrayList?
   We can use indexOf() and lastIndexOf() methods to find out the position of a given element in an ArrayList. 
   indexOf() method returns index of first occurrence of a specified element where as lastIndexOf() method returns index of last 
   occurrence of a specified element in an ArrayList. If element is not found, they will return -1.
 * */
private static void position() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(4);
	list.add(4);
	System.out.println("first indexOf :"+list.indexOf(4));
	System.out.println("Last indexOf :"+list.lastIndexOf(4));

}

/**
 *  How do you check whether the given element is present in an ArrayList or not?
    Using contains() method of ArrayList, we can examine whether the ArrayList contains the given element or not.
    This method returns true if ArrayList has that element otherwise returns false.
 * */
private static void containsOrNot() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println("if list contains :"+list.contains(5));
}

/**
 * How do you find out whether the given ArrayList is empty or not?
   isEmpty() method of ArrayList is used to check whether the given ArrayList is empty or not. 
   This method returns true if an ArrayList contains no elements otherwise returns false.
 * */
private static void isEmpty() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println("if list is empty:"+list.isEmpty());
}

/**
 * How do you find the number of elements present in an ArrayList?
   Using size() method. size() method returns number of elements present in an ArrayList.
 * */
private static void findSize() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println("size of list :"+list.size());
}


/**
 * How do you decrease the current capacity of an ArrayList to the current size?
   trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList.
   Developers use this method to minimize the storage area of an ArrayList.
 * */
private static void decreseCapacity() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	int minCapacity = 15;
	list.ensureCapacity(minCapacity);
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.trimToSize();
}

/**
 * How do you increase the current capacity of an ArrayList?
   ensureCapacity() method is used to increase the current capacity of an ArrayList. 
   However, capacity of an ArrayList is automatically increased when we try to add more elements than the current capacity. 
   To manually increase the current capacity, ensureCapacity() method is used.
 * */
private static void increaseCapacity() {
	ArrayList<Integer> list = new ArrayList<Integer>();
	int minCapacity = 15;
	list.ensureCapacity(minCapacity);
}
}
