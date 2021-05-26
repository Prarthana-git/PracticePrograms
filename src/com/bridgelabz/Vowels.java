package com.bridgelabz;
import java.util.*;

public class Vowels {

	public static void main(String[] args) {

		Scanner Ch = new Scanner(System.in);
		System.out.println("Enter Character");
		//store character in c index value is 0
		char c = Ch.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Given character is an vowel");
		} else {
			System.out.println("Given character is a consonant");
		}
	}

}
