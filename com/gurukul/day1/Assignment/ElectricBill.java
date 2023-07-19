package com.gurukul.day1.Assignment;

import java.util.Scanner;

public class ElectricBill {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name= sc.nextLine();
		System.out.print("Enter consumed reading: ");
		int reading= sc.nextInt();
		
		double charge=0, sur=0;
		
		if(reading>=100) {
			charge = 100*4;
			reading = reading-100;
			
			if(reading < 200) {
				charge = charge+ reading*5;
			}
			else {
				charge = charge+200*5;
				reading = reading-200;
				charge = charge+reading*10;
			}
		}
		
		
		System.out.print("Total electric bill is:  " + totalamount);
	}
}