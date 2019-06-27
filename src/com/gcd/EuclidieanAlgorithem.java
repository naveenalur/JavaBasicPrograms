package com.gcd;

public class EuclidieanAlgorithem {

	public static void main(String[] args) {
		int a=8,b=6;
		System.out.println(gcd(a,b));
	}
	 static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
}
