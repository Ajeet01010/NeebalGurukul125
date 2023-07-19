package com.gurukul.day2;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no to powerise: ");
		int num = sc.nextInt();
		int power = sc.nextInt();
		
		int  base=1;
		for (int i=1; i<= power; i++) {
			base = base*num;
		}
			
		System.out.println(num+" ^ "+power+" = " + base);
	}

}
