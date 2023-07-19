package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class Passenger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of passenger:  ");
		int passenger = sc.nextInt();
		
		int traveller = passenger/50;
		
		System.out.print("No of travellers are:  " + (50*traveller));		
	}
}
