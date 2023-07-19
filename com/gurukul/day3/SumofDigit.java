package com.gurukul.day3;

import java.util.Scanner;

public class SumofDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int no= sc.nextInt();
		
		int sum=0, digit;
		while(no>0) {
			digit = no % 10;  
			sum = sum + digit;   
			no = no / 10; 
		}
		System.out.print("Sum of digit is: " + sum); 
	}
}
