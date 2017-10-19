/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chig.ai;
import java.util.Scanner;

public class Perceptron {
	
	public static void learn(int input1[], int input2[], double weight[], int[] targetOutput,
	        int actualOutput, double learningcoefficent, double threshold, int limitIteration) {
		int loopCounter = 0;
		int epoch = 1;
		int count = 0;
		do {
			if(limitIteration != -1) {
				if(count == limitIteration) {
					return;
				} else {
					count++;
				}
			}
			loopCounter = 0;
			System.out.println("Epoch ==> " + epoch++);
			System.out.println("Input	Target	Actual	Weight1	Weight2");
			System.out.println("---------------------------------------");
			for (int i = 0; i < 4; i++) {
				if ((input1[i] * weight[0] + input2[i] * weight[1]) < threshold) {
					actualOutput = 0;
				} else {
					actualOutput = 1;
				}
				if (actualOutput != targetOutput[i]) {
					weight[0] += learningcoefficent * (targetOutput[i] - actualOutput) * input1[i];
					weight[1] += learningcoefficent * (targetOutput[i] - actualOutput) * input2[i];
				} else
					loopCounter = loopCounter + 1;
				System.out.println("(" + input1[i] + "," + input2[i] + ")" + "	" + targetOutput[i]
				        + "	" + actualOutput + "	" + (float) weight[0] + "	"
				        + (float) weight[1]);
			}
		} while (loopCounter < 4);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n*************************************************\n");
			System.out.println("Welcome to Perceptron Model Simulation");
			System.out.println("\n*************************************************\n");
			System.out.println("1) OR Operation");
			System.out.println("2) AND Operation");
			System.out.println("3) NOR Operation");
			System.out.println("4) NOR Operation");
			System.out.println("5) ShutDown Simulator");
			System.out.println("\n*************************************************\n");
			System.out.print("Enter your choice : ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				new ORGATE().learn();
				break;
			case 2:
				new ANDGate().learn();
				break;
			case 3: new NORGate().learn();
				break;
			case 4: new NORGate1().learn();
				break;
			case 5:
				System.out.println("Shutting Down the Perceptron Model Simulation");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("\nInvalid Choice...!!!");
			}
		} while (true);
	}
}

class ORGATE {
	private double[] weight = { 0.4, 0.8 };
	private double threshold = 2.0;
	private double learningcoefficent = 0.5;
	private int[] input1 = { 0, 0, 1, 1 };
	private int[] input2 = { 0, 1, 0, 1 };
	private int[] targetOutput = { 0, 1, 1, 1 };
	private int actualOutput;
	private int limitIteration = -1;

	public void learn() {
		Perceptron.learn(input1, input2, weight, targetOutput, actualOutput, learningcoefficent,
		        threshold, limitIteration);
	}
}

class ANDGate {
	private double[] weight = { 0.9, 0.2 };
	private double threshold = 2.0;
	private double learningcoefficent = 0.5;
	private int[] input1 = { 0, 0, 1, 1 };
	private int[] input2 = { 0, 1, 0, 1 };
	private int[] targetOutput = { 0, 0, 0, 1 };
	private int actualOutput;
	private int limitIteration = -1;

	public void learn() {
		Perceptron.learn(input1, input2, weight, targetOutput, actualOutput, learningcoefficent,
		        threshold, limitIteration);
	}
}

class NORGate {
	private double[] weight = { 1.4, 0.7 };
	private double threshold = 2.0;
	private double learningcoefficent = 0.5;
	private int[] input1 = { 0, 0, 1, 1 };
	private int[] input2 = { 0, 1, 0, 1 };
	private int[] targetOutput = { 1, 0, 0, 0 };
	private int actualOutput;
	private int limitIteration = 16;

	public void learn() {
		Perceptron.learn(input1, input2, weight, targetOutput, actualOutput, learningcoefficent,
		        threshold, limitIteration);
	}
}

class NORGate1 {
	private double[] weight = { 1.4, 0.7 };
	private double threshold = -2.0;
	private double learningcoefficent = 0.5;
	private int[] input1 = { 0, 0, 1, 1 };
	private int[] input2 = { 0, 1, 0, 1 };
	private int[] targetOutput = { 1, 0, 0, 0 };
	private int actualOutput;
	private int limitIteration = -1;

	public void learn() {
		Perceptron.learn(input1, input2, weight, targetOutput, actualOutput, learningcoefficent,
		        threshold, limitIteration);
	}
}