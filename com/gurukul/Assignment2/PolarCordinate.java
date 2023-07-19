package com.gurukul.Assignment2;

import java.util.Scanner;

public class PolarCordinate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of both polar: ");
		double r1 = sc.nextInt();
		double r2 = sc.nextInt();
		System.out.println("Enter the angle of both polar: ");
		double th1= sc.nextInt();
		double th2= sc.nextInt();
		
		double x1, x2, y1, y2, x3, y3, r3, th3;
		th1= Math.toRadians(th1);
		th2= Math.toRadians(th2);
		
		x1= r1 * Math.cos(th1);
		y1= r1 * Math.sin(th1);
		
		x2= r2 * Math.cos(th2);
		y2= r2 * Math.sin(th2);
		
		x3 = x1 + x2;
		y3 = y1 + y2;
		
		r3 = Math.sqrt((Math.pow(x3, 2) + Math.pow(y3, 2)));
		th3= Math.atan2(y3, x3);
		th3= Math.toDegrees(th3);
		
		System.out.println("r3: " + r3+ "th3: "+ th3);
		
	}

}
