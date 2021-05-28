package com.bridgelabz;

import java.util.*;

public class nibble {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = s.nextInt();
		Util.toBinary(no);
		System.out.println("After swapping Nibbles no is = " + swapNibbles(no));
		int num = swapNibbles(no);
		if (PowerofTwo(num)) {
			System.out.println(PowerofTwo(num) + " Number is Power of Two");
		} else {
			System.out.println(PowerofTwo(num) + " Number is Not a Power of Two");
		}
	}

	static int swapNibbles(int no) {
		return ((no & 0x0F) << 4 | (no & 0xF0) >> 4);
	}

	static boolean PowerofTwo(int num) {
		 return num!=0 && ((num&(num-1)) == 0);
	}

}
