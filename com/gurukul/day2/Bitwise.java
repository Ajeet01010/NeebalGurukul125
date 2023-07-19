package com.gurukul.day2;

import java.util.Scanner;

public class Bitwise {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit: ");
		int digit = sc.nextInt();
		int binary = sc.nextInt();
		
		System.out.println("Output is: " + ((digit>>(binary-1))&1));
	}
}