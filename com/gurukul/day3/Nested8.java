package com.gurukul.day3;

public class Nested8 {
	public static void main(String args[]) {
		int i,j;
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=(5-i);j++) {
				System.out.print(" ");
			}
			for (j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(i=1;i<=9;i++) {
			for(j=1;j<=1;j++) {
				System.out.print("*");
			}
		}
		System.out.println();
		for (i = 4; i >= 1; i--) {
			for(j=1;j<=4;j++)
				System.out.print(" ");
            for (j = 1; j <= i; j++) {
            	
                System.out.print("*");
            }  
            System.out.println();
        }
	}

}
