package com.gurukul.day3;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any no: ");
		int num = sc.nextInt();
		boolean flag=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}	
		}
		if(flag)
			System.out.println("No is prime no " + num);	
		else
			System.out.println("No is not prime no " + num);
		
	}

}
