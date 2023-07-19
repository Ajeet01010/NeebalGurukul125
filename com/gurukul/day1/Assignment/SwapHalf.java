package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class SwapHalf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any four digit no:  ");
		int digit = sc.nextInt();
		
		int fhalf, shalf;
		fhalf = digit/100;
		shalf = digit%100;
		
		shalf = shalf*100;
		shalf = fhalf+shalf;
		
		System.out.println("After swapping digit:  " + shalf);
	}
}
