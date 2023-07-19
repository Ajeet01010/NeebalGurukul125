package com.gurukul.day2;

import java.util.Scanner;

public class Cordinate {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius and theta value: ");
		double r= sc.nextInt();
		double theta = sc.nextInt();
		
		double x,y;
		y= r*(Math.sin(Math.toRadians(theta)));
		x= r*(Math.cos(Math.toRadians(theta)));
		
		System.out.print("Coordinates are: " + x+ "y: " + y);
		
	}

}
