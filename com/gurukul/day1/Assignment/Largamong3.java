package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class Largamong3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three variable: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		int max;
		
		if(a>b)
			max = a;
		else
			max = b;
		
		if(max>c)
			max = max;
		else
			max =c;
		
		System.out.print("Maximum no is: "+ max);
	}

}
