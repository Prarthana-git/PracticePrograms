package com.bridgelabz;

import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a,b and c values");
			double a = s.nextInt();
			double b = s.nextInt();
			double c = s.nextInt();

			// comparing the value of a with 0, if a is 0 then the equation is not quadratic
			if (a == 0) {
				System.out.println("The value of a cannot be 0.");
				return;
			}
			// calculating delta
			double d = b * b - 4 * a * c;
			double sqrtval = Math.sqrt(Math.abs(d));

			if (d > 0) {
				System.out.println("The roots of the equation are real and different. \n");
				System.out.println((double) (-b + sqrtval) / (2 * a) + "\n" + (double) (-b - sqrtval) / (2 * a));
			} else if (d == 0) {
				System.out.println("The roots of the equation are real and same. \n");
				System.out.println(-(double) b / (2 * a) + "\n" + -(double) b / (2 * a));
			}
			// executes if d < 0
			else {
				System.out.println("The roots of the equation are complex and different. \n");
				System.out.println(
						-(double) b / (2 * a) + " + i" + sqrtval + "\n" + -(double) b / (2 * a) + " - i" + sqrtval);
			}
		}
	}

}
