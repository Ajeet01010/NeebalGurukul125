package com.gurukul.day2;

import java.util.Scanner;

public class Summ2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms: ");
		int num = sc.nextInt();
		
		double f=1, t, fact=1, i;
		
		for(i=2;i<=num;i++) {
			fact = fact*i;
			t=1+(1/fact);
			f=t;
		}
		System.out.println("Sum of nth term is: "+ f);
	}

}
