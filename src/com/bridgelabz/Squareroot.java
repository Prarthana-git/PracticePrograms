package com.bridgelabz;

import java.util.*;

public class Squareroot {

	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter Non-Negative Integer");
		double v = Obj.nextDouble();
		sqrt(v);
	}

	static double sqrt(double c) {
		double t = c;
		double eplison = 1e-15;
		while (Math.sqrt(t - c / t) > eplison * t) {
			t = (c / t + t) / 2;
		}
		return t;
	}
}
