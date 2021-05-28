package com.bridgelabz;

import java.util.*;

public class Coupon {
	public static void main(String[] args) {
		int[] couponNumber = { 1, 6, 8, 9 };
		int[] randomList = new int[couponNumber.length];
		int totalRandoms = 0;
		int checkCount = 0;
		while (checkCount < couponNumber.length) {
			System.out.println(checkCount);
			totalRandoms++;
			int randomNum = (int) (Math.random() * (9));
			System.out.println("Random value : " + randomNum);
			if (checkValue(randomNum, couponNumber) && !checkValue(randomNum, randomList)) {
				randomList[checkCount] = randomNum;
				checkCount = checkCount + 1;
			}
		}
		System.out.println("Total randoms" + totalRandoms);
	}

	public static boolean checkValue(int randomNum, int[] arrayobj) {

		for (int i = 0; i < arrayobj.length; i++) {
			if (arrayobj[i] == randomNum) {
				return true;
			}
		}
		return false;
	}
}
