package com.bridgelabz;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter number");
		int n = f.nextInt();
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n = n / 2;
		}// n must be odd 
		for (int i = 3; i <= n; i=i+2) {
			// While i divides n, print i and divide n
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n/i;
			}
		}
		// This condition is to handle the case when
		// n is a prime number greater than 2
		if (n > 2)
			System.out.print(n);
	}

}
