package com.amstrongNumber;

import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
	System.out.println("Enter the number you wanted to create amstrong number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number==FindAmstrongNumber(number)) {
		System.out.println("The number is amstrong"+number);
	}
	else
	{
		System.out.println("The number is not a amstrong");	
	}

}

static int FindAmstrongNumber(int number) {
	int result,devident,remender;
	
	
	int sum=0;
	int numcounts=numberOfdegit(number);
	while(number>0) {
		number=number/10;
		remender=number%10;
		
			sum+=Math.pow(number, numcounts);
	}
	return sum;
}



static int numberOfdegit(int n) {
	int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
	
	return count;
}
}
