package com.bridgelabz;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter value for rows and column");
		int row = d.nextInt();
		int column = d.nextInt();
		   int twoD[][] = new int[row][column];//definig row and column wher index value start 00
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < column; j++) {
		        twoD[i][j] = i*j;
		      }
		    }
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < column; j++) {
		        System.out.print(twoD[i][j] + " ");
		      }
		      System.out.println();
		    }
	}

}
