package com.gurukul.day2;

import java.util.Scanner;

public class Sinx {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms: ");
		double no = sc.nextInt();
		no = Math.toRadians(no);
		
		double s=0, num =no, fact = 1;
		
		for(int i=1;i<=10;i++) {
			fact =fact*i;
			if(i%2 != 0) {
				s = s + (num/fact);
				num = -num*no*no;
			}
		}
		System.out.println("Sum of nth term is: "+ s);
		System.out.println(Math.sinh(no));
		
	}
}
