package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time in millisecond:  ");
		int ms = sc.nextInt();
		
		int sec, min, hrs;
		sec = ms/1000;
		min = sec/60;
		hrs = min/60;
		
		sec  = sec%60;
		min = min%60;
		
		System.out.println("Converted milisecond in time is: " + hrs + ":" + min + ":" + sec);
		
	}

}
