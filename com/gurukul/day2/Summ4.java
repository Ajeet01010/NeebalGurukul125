package com.gurukul.day2;

import java.util.Scanner;

public class Summ4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms: ");
		int no = sc.nextInt();
		
		double s=0,num=1, fact=1;
		
		for(int i=1;i<=no;i++) {
			fact =fact*i;
			if(i%2 != 0) {
				s = s + (num/fact);
				num = -num;
			}
		}
		System.out.println("Sum of nth term is: "+ s);
	}
	

}
