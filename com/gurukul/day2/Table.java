package com.gurukul.day2;

import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no to print table:  ");
		int num = sc.nextInt();
		
		for(int i=1; i<11;i++) {
			int mul = num * i;
			System.out.println(num + " * " + i + " = " + mul);
		}
	}

}
