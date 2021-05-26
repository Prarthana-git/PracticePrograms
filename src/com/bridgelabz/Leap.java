package com.bridgelabz;
import java.util.*;

public class Leap {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = l.nextInt();
		// enter only 4 digit number
		if (year > 999 && year < 10000) { // remainder of year is equal to 0
			if (year % 4 == 0) {
				System.out.println("Leap year " + year);
			} else {
				System.out.println("Not a Leap year " + year);
			}

		}

	}

}
