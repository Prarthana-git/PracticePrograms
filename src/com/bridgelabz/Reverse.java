package com.bridgelabz;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any Number: ");
		int num = sc.nextInt();
		int rev=0,rem=0;
		while(num != 0)
		{
			 rem=num%10;//taking remainder
		     rev=rev*10+rem;
			 num=num/10;
		}
    System.out.println("Reverse Number is " + rev);
	}

}
