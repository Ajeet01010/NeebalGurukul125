package com.gurukul.Assignment2;

import java.util.Scanner;

public class BoundFibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower bound: ");
		int lower = sc.nextInt();
		System.out.println("Enter upper bound: ");
		int upper = sc.nextInt();
		
		int f=0, b=1,i;
		
		for(i=1;i<=upper;i++) {
			if(f>lower && f<upper)
				System.out.print(f + " ");
			int a= f+b;
			f=b;
			b=a;
		}
	}

}
