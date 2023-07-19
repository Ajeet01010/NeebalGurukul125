package com.gurukul.day2;

import java.util.Scanner;

public class Summ1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of term: ");
		int num = sc.nextInt();
		
		double f=1, t,i;
		
		for(i=2;i<=num;i++) {
			t=f+(1/i);
			f=t;
			
		}
		System.out.println("Summation upto nth term: "+ f);
		
	}

}
