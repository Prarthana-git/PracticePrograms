package com.bridgelabz;
import java.util.*;

public class Largestnum {

	public static void main(String[] args) {
		Scanner Lar = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int x = Lar.nextInt();
		System.out.print("Enter the second number:");
		int y = Lar.nextInt();
		System.out.print("Enter the third number:");
		int z = Lar.nextInt();
//Check x is greater than any two of number
		if (x > y && x > z) {
			System.out.println("Largest number is:" + x);
		} else if (y > z) {
			System.out.println("Largest number is:" + y);

		} else {
			System.out.println("Largest number is:" + z);

		}
	}

}
