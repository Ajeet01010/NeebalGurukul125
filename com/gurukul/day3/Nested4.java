package com.gurukul.day3;

public class Nested4 {
	public static void main(String args[]) {
		int i,j;
		
		for(i=1;i<=5;i++) {
			for(j=1;j<=(5-i);j++)
				System.out.print(" ");
			for (j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			for(j=1;j<(j-1);j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
