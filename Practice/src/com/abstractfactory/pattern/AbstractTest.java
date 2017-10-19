package com.abstractfactory.pattern;

import java.util.Scanner;

public class AbstractTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the animal name : ");
		String animalName = scanner.next();
		Animal animal = get(animalName);
		animal.makeSound();
		scanner.close();
	}
	
	
	
// the following method is called factory design pattern	
	
	public static Animal get(String name) {
		if(name.equals("cat")) {
			return new Cat();
		} else {
			return new Dog();
		}
	}

}
