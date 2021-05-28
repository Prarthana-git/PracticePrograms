package com.bridgelabz;

import java.util.*;

public class temprature {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 to convert from Fahrenheit to Celsius");
		System.out.println("Enter 2 to convert from Celsius to Fahrenheit");
		int choice = in.nextInt();
		double ft = 0.0, ct = 0.0;
		if (choice == 1) {
			System.out.print("Enter temperature in Fahrenheit: ");
			ft = in.nextDouble();
		} else {
			System.out.print("Enter temperature in Celsius: ");
			ct = in.nextDouble();
		}
		temp(choice, ft, ct);
	}
	public static void temp(int choice, double ft, double ct) {
		switch (choice) {
		case 1:
			ct = 5 / 9.0 * (ft - 32);
			System.out.println("Temperature in Celsius: " + ct);
			break;
		case 2:
			ft = 1.8 * ct + 32;
			System.out.println("Temperature in Fahrenheit: " + ft);
			break;
		default:
			System.out.println("Incorrect Choice");
			break;
		}
	}
}
