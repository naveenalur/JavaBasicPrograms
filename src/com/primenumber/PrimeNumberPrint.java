package com.primenumber;

public class PrimeNumberPrint {
	
	public static void main(String[] args) {
		PrimeNumberPrint(10);
	}
	
	static void  PrimeNumberPrint(int n) {
	int count=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			count++;
			
		}
		if(count==2) {
			System.out.println(i);
			
		}
	}
		
	}
	

}
