package com.gurukul.day2;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no to find factorial: ");
		int num = sc.nextInt();
		
		int fact=1,i=0;
		for (i = 1; i <= num; i++)
            fact = fact * i;

        System.out.println("\nFactorial of "+num+" is: " + fact);
	}

}
