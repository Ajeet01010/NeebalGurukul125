package com.gurukul.Assignment2;

import java.util.Scanner;

public class EvenFibonacci {
	public static void main(String args[]) {
		int f=0, s=1, t=0, count =10,i;
		
		for(i=1;i<=count;i++) {
			if(f%2==0) 
				System.out.print(f +" ");
			else
				count++;
			t=f+s;
			f=s;
			s=t;
		}
		
	}

}
