package com.bridgelabz;
import java.util.*;

public class SumOfTriples {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		// Define Total Elements
		num = sc.nextInt();
		int[] arr = new int[6];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

}
