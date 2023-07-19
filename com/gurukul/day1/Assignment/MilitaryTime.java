package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class MilitaryTime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time in hrs: ");
		int time= sc.nextInt();
		
		int hrs = time/100;
		
		
		hrs = hrs%12;
		time = time%100;
		
		System.out.print("Time in standard format: "  + hrs + " : " + time);
	}
}
