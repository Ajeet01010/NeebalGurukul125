package com.gurukul.Assignment2;

import java.util.Scanner;

public class Cosx {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degree: ");
		double degree = sc.nextDouble();
		degree = Math.toRadians(degree);
		
		System.out.println("Enter a limit: ");
		int nu = sc.nextInt();
		double sum = 1, fact = 1;
		double num = -(Math.pow(degree,  2));
		
		for(int i=1; i<= nu; i++) {
			fact = fact*i;
			if(i%2==0) {
				sum = sum + (num/fact);
				num = -num*degree*degree;
			}
		}
		System.out.println(sum);
	}

}
