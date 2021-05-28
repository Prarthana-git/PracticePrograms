package com.bridgelabz;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		Scanner bin=new Scanner(System.in);
		System.out.println("Enter the deciml number");
         int no=bin.nextInt();
         toBinary(no);
	}
     public static void toBinary(int no)
	{ 
    	 int[] binary=new int[10];
    	 int i=0;
    	 while (no>0)
    	 {
    		binary[i]= no%2;
    		no=no/2;
    		i++;
    	 }
    	 for (int j=i-1 ;j>=0 ;j--)
    	 {
    		 System.out.println(binary[j]);
    	 }
		
	}
	

}
