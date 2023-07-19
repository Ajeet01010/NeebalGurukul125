package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any ARMSTRONG no: ");
		int num= sc.nextInt();
		
		double a,b,c, arm;
		
		a= num%10;
		b= (num/10)%10;
		c= num/100;
		
		
		arm=Math.pow(a, 3)+ Math.pow(b,  3)+ Math.pow(c, 3);
		
		
		if (num == arm)
			System.out.print("Input no is an Armstrong No: " + num);
		else
			System.out.print("Input no is not an Armstrong No: " + num);
		
		
	}
}
