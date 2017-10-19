package com.chig.collection;


import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetApiPractice {

	
	public static void main(String[] args) {
		
		//comparatorExample1();
		
		
			
			comparatorExample2();
	}



// example 1
	
	/*
	private static void comparatorExample1() {
		TreeSet<String> ts = new TreeSet<String>(new MyComparator());
		
		ts.add("asd");
		ts.add("jhmu");
		ts.add("rwee");
		ts.add("ert");
		ts.add("rgrt");
			
		System.out.println(ts);
	}
}


//output after using comparator: [asd, ert, jhmu, rgrt, rwee]
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String str1,String str2) {
	
		return str1.compareTo(str2);
	}
*/
	
//example 2 starts here.
	private static void comparatorExample2() {
		TreeSet<Employe> name = new TreeSet<Employe>(new NameComparator());
		name.add(new Employe("harris",2000));
		name.add(new Employe("james",3200));
		name.add(new Employe("tweet",1000));
		name.add(new Employe("chris",3434));
		name.add(new Employe("daniel",9643));
			
		for(Employe e: name){
			System.out.println(e);
		}
		System.out.println();
		
		
		TreeSet<Employe> salary = new TreeSet<Employe>(new SalaryComparator());
		salary.add(new Employe("harris",2000));
		salary.add(new Employe("james",3200));
		salary.add(new Employe("tweet",1000));
		salary.add(new Employe("chris",3434));
		salary.add(new Employe("daniel",9643));
			
		for(Employe e: salary){
			System.out.println(e);
		}
	}

}


class NameComparator implements Comparator<Employe>{

	@Override
	public int compare(Employe e1, Employe e2) 
	{
				return e1.getName().compareTo(e2.getName());
	}
	
}

class SalaryComparator implements Comparator<Employe>{

	@Override
	public int compare(Employe e1, Employe e2) {
		
		if(e1.getSalary() > e2.getSalary()){
			return 1;
		} else 
			
		return -1;
	}
	
}


class Employe{
	String name;
	int salary;
		
	public Employe(String name,int salary){
		 this.name = name;
		 this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString(){
		return "name : " + this.name + "    salary : " + this.salary;
	}
	
}

