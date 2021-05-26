package com.bridgelabz;
import java.util.*;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter number");
		int n = p.nextInt();//user will enter the number 
		int poweroftwo = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + poweroftwo); // print out the power of two
			poweroftwo = 2 * poweroftwo; // double to get the next one
		}
	}

}
