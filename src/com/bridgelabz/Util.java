package com.bridgelabz;

public class Util {

	/**
	 * to calculate monthly payment for r interest and p principal for y years p the
	 * principal amount given y the year for which p is given r the rate at which p
	 * is given monthly payment
	 */
	static double monthlyPayment(double p, double y, double R) {
		double n = 12 * y;
		double r = R / (12 * 100);
		double payment = p * r / (1 - Math.pow((1 + r), -n));
		return payment;
	}

	public static void toBinary(int no) {
		int[] binary = new int[10];
		int i = 0;
		while (no > 0) {
			binary[i] = no % 2;
			no = no / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.println(binary[j]);

		}
	}

}
