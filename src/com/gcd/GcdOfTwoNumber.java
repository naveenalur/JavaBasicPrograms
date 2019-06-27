package com.gcd;

public class GcdOfTwoNumber {
	public static void main(String[] args) {
		int a=8,b=6;
		//System.out.println(Math.min(a, b));
		int gcd=0;
		if(a==0||b==0)
			gcd=1;
		for(int i=2;i<Math.min(a, b);i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
		System.out.println(6%8);
		
	}

}
