package com.gurukul.day3;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any no: " );
		int num=sc.nextInt();
		int temp, digits=0, lastdigit=0; 
		double digit, sum=0;
		temp=num;   
		while(temp>0)    
		{   
		temp = temp/10;   
		digits++;   
		}   
		temp = num;   
		while(temp>0)   
		{         
			lastdigit = temp % 10;   
			digit = Math.pow(lastdigit, digits);
			sum = sum + digit;   
		
			temp = temp/10;   
		} 
		if(sum==num)
			System.out.print(num+" is Armstrong No");
		else
			System.out.print(num+" is not Armstrong No");
		
	} 
	 
		 
		 
}


