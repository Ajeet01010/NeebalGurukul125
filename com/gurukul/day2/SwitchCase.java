package com.gurukul.day2;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Square  2. Circle  3. Triangle");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		double area;
		
		switch(choice) {
		case 1:
			System.out.println("Enter the side of square: ");
			int side = sc.nextInt();
			area = Math.pow(side, 2);
			System.out.println("Area of circle is: " + area);
			break;
		case 2:
			System.out.println("Enter the radius of circle: ");
			int radius = sc.nextInt();
			area = Math.PI*Math.pow(radius, 2);
			System.out.println("Area of circle is: " + area);
			break;
		case 3:
			System.out.println("Enter the side of triangle: ");
			int side1 = sc.nextInt();
			area = (Math.sqrt(3))/4 * Math.pow(side1, 2);
			System.out.println("Area of triangle is: " + area);
			break;
		default:
			System.out.println("\nEnter correct choice");
			break;
		}
	}
}
