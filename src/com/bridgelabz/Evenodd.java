package com.bridgelabz;
import java.util.*;

public class Evenodd {

	public static void main(String[] args) {
		Scanner EO = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = EO.nextInt();
		// Check number remainder is equal to 0
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

	}

}
