package com.sortingAlorithm;

import java.util.Scanner;

public class AllSortInOneMainClass {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number of elements need to sort");
		int n=sc.nextInt();
		int[]  arrayElemts=new int[n];
		
		
		System.out.println("Enter the "+n+" of elements");
		
		for (int i = 0; i < n; i++) {
			arrayElemts[i]=sc.nextInt();
		}
		
		AllSortAlogorithms allSortAlogorithms= new AllSortImplementationClass();
		System.out.println("Enter your choice\n"
				+ "1.Selection sort\n"
				+ "2.Bubble Sort\n"
				+ "3.Insertion Sort\n"
				+ "4.Merge Sort\n"
				+ "5.Quick Sort\n");
		int choice=sc.nextInt();
		String continueFlag="y";
		while(continueFlag.equalsIgnoreCase("y")) {
			switch (choice) {

			case 1:
				System.out.println("Executing the Selection sort");
				allSortAlogorithms.PrintArray(allSortAlogorithms.SelectionSort(arrayElemts));
				System.out.println();
				break;

			case 2:
				System.out.println("Executing the Bubble sort");
				allSortAlogorithms.PrintArray(allSortAlogorithms.BubbleSort(arrayElemts));
				System.out.println();
				break;
				
			case 4:
				System.err.println("Executing the Merge Sort");
				allSortAlogorithms.PrintArray(allSortAlogorithms.BubbleSort(arrayElemts));
				break;
			
			}
			System.out.println("Do you want to continue Y/N: ");
			continueFlag=sc.next();
		}
		
		
	
	}

}


