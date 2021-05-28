package com.bridgelabz;

import java.util.*;

public class Fibnacci {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ob.nextInt();
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.print(n1 + "\n" + n2+"\n");// printing 0 and 1

		for (int i = 2; i < num; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.println("" + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
