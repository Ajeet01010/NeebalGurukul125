package com.gurukul.day3;

public class NestedLoop {
	public static void main(String args[]) {
		int i,j;
		
		for(i=1;i<=5;i++) {
			for(j=1;j<=3;j++)
				System.out.print(j);
			System.out.println(" ");
		}
		
		System.out.println("Ascending Order");
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println(" ");
		}
		
		
	}

}
