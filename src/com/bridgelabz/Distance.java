package com.bridgelabz;

import java.util.*;

public class Distance {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter value for x and y");
		int x = d.nextInt();
		int y = d.nextInt();

		// using Math.pow()
		// double distance = Math.sqrt((x * x) + (y * y));
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);
	}

}
