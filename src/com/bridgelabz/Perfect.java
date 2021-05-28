package com.bridgelabz;

import java.util.*;

public class Perfect {

	public static void main(String[] args) {
		int i, Number, Sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();

		for (i = 1; i < Number; i++) {            
        //Factors of number
			if (Number % i == 0) {
				Sum = Sum + i;//sum of factors
				System.out.println(Sum);
			}
		}
		if (Sum == Number) {
			System.out.println(" Perfect Number is "+ Number);
		} else {
			System.out.println("Number is NOT a Perfect Number"+ Number);
		}
	}
}
