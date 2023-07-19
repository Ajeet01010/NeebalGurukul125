package com.gurukul.day3;

import java.util.Scanner;

public class LargestNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any no: ");
		int num= sc.nextInt();
		
		int digit1=0, digit2=0,max = 0;
		while(num>0) {
			digit1= num%10;
			num=num/10;
			digit2= num%10;
			if(digit1>digit2)
				max=digit1;
			else
				max=digit2;
		}
		System.out.print("Max no is: "+ max);
	}

}
