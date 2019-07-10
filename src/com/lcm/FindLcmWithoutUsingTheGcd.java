package com.lcm;

public class FindLcmWithoutUsingTheGcd {
	private static int min(int a,int b)
	{
		if(a<b) return a;
		else return b;
	}
	
	private static int max(int a,int b)
	{
		if(a>b) return a;
		else return b;
	}
	
	private static int lcm(int a,int b) {
	 int largeNumber=max(a, b);
	 int minimuValue=min(a, b);
	 for(int i=largeNumber;;i+=largeNumber) {
		 if(i%minimuValue==0)
			 return i;
	 }
	 
	}
	
	public static void main(String[] args) {
		int a=9,b=3;
		System.out.println("The LCM of "+lcm(5, 7));
	}

}
