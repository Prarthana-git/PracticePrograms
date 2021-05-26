package com.bridgelabz;
import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("The number of time coin flips");
		int n = obj.nextInt();
		// condition for positive number and how many time coin flip
		while (n >= 0) {
			for (int i = 1; i <= n; i++) {
				double coin = Math.random();
				if (coin > 0.5) {
					head++;
					n--;
				} else {
					tail++;
					n--;
				}
				double percenthead = (head * 100.0) / 10;
				double percenttail = (tail * 100.0) / 10;
				System.out.println("Heads " + head);
				System.out.println("Tails " + tail);
				System.out.println("Percentage of Head " + percenthead);
				System.out.println("Percentage of tail " + percenttail);
			}
		}
	}
}
