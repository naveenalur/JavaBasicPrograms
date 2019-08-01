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
		
		String continueFlag="y";
		while(continueFlag.equalsIgnoreCase("y")) {
			System.out.println("Enter your choice\n"
					+ "1.Selection sort\n"
					+ "2.Bubble Sort\n"
					+ "3.Insertion Sort\n"
					+ "4.Merge Sort\n"
					+ "5.Quick Sort\n");
			int choice=sc.nextInt();
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
				System.out.println("Executing the Merge Sort");
				int low=0,high=arrayElemts.length-1;
				allSortAlogorithms.MergeSort(arrayElemts, low, high);
				break;
			case 5:
				System.out.println("Executing the Quick Sort");
				int low1=0,high1=arrayElemts.length-1;
				allSortAlogorithms.QuickSort(arrayElemts, low1, high1);
				for (int i = 0; i < arrayElemts.length; i++) {
					System.out.println(arrayElemts[i]);
				}
				break;
			
			}
			System.out.println("Do you want to continue Y/N: ");
			continueFlag=sc.next();
		}
		
		
	
	}
	public void QuickSort(int[] array,int low ,int high  ) {
		if(low<high)
		{
			int pi=Partition(array, low, high);
			QuickSort(array, low,pi-1);
			QuickSort(array, pi+1, high);
		}
		
	}
public static int Partition(int [] array,int low,int high) {
		
		int pivoteElement=array[high];
		int i=(low-1);
		
		
		for (int j = 0; j < array.length; j++) {
			if(array[j]<pivoteElement) {
				i++;
				int temp=array[i];
				array[j]=array[i];
				array[i]=temp;
			}
			
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return i+1;
	}

}


