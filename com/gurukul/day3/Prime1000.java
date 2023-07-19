package com.gurukul.day3;

public class Prime1000 {
	public static void main(String args[]) {
		for(int n=1;n<=1000;n++) {
			boolean isPrime=true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.print(n + " ");
		}
	}

}
