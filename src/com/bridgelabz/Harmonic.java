package com.bridgelabz;
import java.util.*;

public class Harmonic {

	public static void main(String[] args) {

		Scanner ha = new Scanner(System.in);
		System.out.println("Enter The number");
		int num = ha.nextInt();
		double sum = 0.0;
		// sum of harmonic series
		for (double i = 1; i <= num; i++) {
			sum = sum + 1 / i;
		}
		System.out.println("Sum is " + sum);
	}

}
