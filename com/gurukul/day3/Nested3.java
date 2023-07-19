package com.gurukul.day3;

public class Nested3 {
	public static void main(String args[]) {		
		int i,j;
		
		int x=1;
		for(i=1;i<=5;i++) {			
			int y=1;
			for(j=1;j<=i;j++) {
				int z=1;				
				System.out.print(x+""+y+""+z+" ");
				x++; y++; z++;
			}
			System.out.println();
		}
	}

}
