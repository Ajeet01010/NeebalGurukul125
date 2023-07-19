package com.gurukul.day3;

public class Nested6 {
	public static void main(String args[]) {
		int i,j;
		
//		for(i=1;i<=5;i++) {
//			for(j=1;j<=i;j++)
//				System.out.print((char)(j+64));
//			System.out.println();
//		}
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((char)(j+64));				
			}
			for (j=1;j<=(4*2-2*i);j++) {
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
				System.out.print((char)(j+64));
			System.out.println();
		}
	}

}
