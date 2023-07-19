package com.gurukul.day3;

public class Nested1 {
	public static void main(String args[]) {
		int i,j;
		
		for(i=1;i<=5;i++) {
			if(i%2!=0) {
				for(j=1;j<=i;j++) 
					System.out.print((char)(j+64));
				
			}
			else {
				for(j=1;j<=i;j++) 
					System.out.print( "*");				
			}
			System.out.println();
				
		}
	}

}
