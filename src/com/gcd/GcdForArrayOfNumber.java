package com.gcd;

import java.util.Scanner;

public class GcdForArrayOfNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements need to calculate the GCD");
	
		
		int size= sc.nextInt();
		int [] array=new int[size];
		
		System.out.println("Enter the numbers need to find the gcd");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println( findGCD(array, size));
		
		
	}
	
	static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++) 
            result = gcd(arr[i], result); 
  
        return result; 
    } 
	
	static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}

}
