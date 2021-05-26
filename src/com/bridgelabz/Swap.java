package com.bridgelabz;
import java.util.*;

public class Swap {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = 0;
		System.out.println("Before Swaping x=" + x + " and y=" + y);
		// swapping using third variable
		z = x;
		x = y;
		y = z;
		System.out.println("After swaping two numbers using third variable x=" + x + " and y=" + y);
		// swapping without using third variable
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping two numbers without using third variable x=" + x + " and y=" + y);

	}

}
