package com.bridgelabz;

import java.util.*;

public class VendingMachine {

	// function to count and
	// print currency notes
	public static void countCurrency(int amount) {
		int notes[] = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] noteCounter = new int[10];

		// count notes
		for (int i = 0; i < 10; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}

		// Print notes
		System.out.println("Currency Count =");
		for (int i = 0; i < 10; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

	// driver function
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = s.nextInt();
		countCurrency(amount);
	}

}
