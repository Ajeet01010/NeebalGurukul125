package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class YearDays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of days:  ");
		int days = sc.nextInt();
		
		int year, month, week, day;
		year = days/365;
		month = days%365;
		month = month/30;
		days = days - (30*month + year*365);
		week = days/7;
		day =days%7;
		
		System.out.println("No of Year: " + year+ "  Month:" + month + "  Week:" + week+ "  Day:" + day);
	}
}