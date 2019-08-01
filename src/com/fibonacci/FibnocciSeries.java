package com.fibonacci;

import java.text.BreakIterator;
import java.util.Scanner;

public class FibnocciSeries {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("Entre your number..!");
	int n=sc.nextInt();
	
	System.out.println("Enter your choice for fibnocci series..!\n 1.Print Fibnacci Serise\n 2. Using Recurssion \n 3.");
	int choice=sc.nextInt();
		//System.out.println(choice +" "+n);
	switch (choice) { 
		case 1: 
			//System.out.println("Calling method");
			
			 
			 System.out.println(Fibnocci.PrintFibonacci(n));
			 
			  break;
		case 2: 
			int sum=0;
			for (int i = 0; i <n; i++) {
				System.out.println(Fibnocci.UsingRecursion(i));
				sum+=Fibnocci.UsingRecursion(i);
			}
			System.out.println("Nth element is "+Fibnocci.UsingRecursion(n));
			
		  break;
		  
		  }
		 
	//Fibnocci.PrintFibonacci(10);
}

 static class  Fibnocci{
	
	static int PrintFibonacci(int n) {
		
		int f1 = 0, f2 = 1, i; 
		
        if (n<= 1) 
        	return n;
        
        for (i = 1; i <= n; i++) 
        { 
        	System.out.println(f2);
            int next = f1 + f2; 
            f1 = f2; 
            f2 = next; 
        } 
       return f2;
	}
	static int UsingRecursion(int n) {
		if(n<=1) {
			return n;
		}
		return (UsingRecursion(n-1) + UsingRecursion(n-2));
	}
}


}
