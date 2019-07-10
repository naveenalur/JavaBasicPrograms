package com.lcm;

public class FindLCMusingFormulae {
	public static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		return gcd(b/a,a);
	}
	
	private static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
	

	public static void main(String[] args) {
		int a=6,b=15;
		System.out.println("The LCM is "+lcm(a,b));
	}
}
