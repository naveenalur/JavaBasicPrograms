package com.sortingAlorithm;

import com.sun.mail.imap.Rights.Right;

public class AllSortImplementationClass implements AllSortAlogorithms
{

	@Override
	public int[] SelectionSort(int[] array) {
	
		for (int i = 0; i < array.length-1; i++) {
			int min_index=i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[min_index]) {
					min_index=j;
				}
			}	
			int temp=array[min_index];
			array[min_index]=array[i];
			array[i]=temp;
		}
		return array;
	}

	@Override
	public int[] BubbleSort(int[] array) {
		int temp=0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length-i-1; j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		return array;
	}

	
	public int[] InsertionSort(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}


	public void MergeSort(int[] array,int l,int h) {
		//1.Calculate the middle of array

		if(l<h) {
			int mid=(l+h)/2;
			MergeSort(array, l, mid);
			MergeSort(array, mid+1, h);
			
			MergeArray(array, l, mid, h);
		}
		
		PrintArray(array);
	}

	
	public void QuickSort(int[] array,int low ,int high  ) {
		if(low<high)
		{
			int pi=Partition(array, low, high);
			QuickSort(array, low,pi-1);
			QuickSort(array, pi+1, high);
		}
		
	}

	@Override
	public void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +"\t");
		}
	}
	
	public static void MergeArray(int [] array,int l,int mid,int h) {
		//find the length of two array
		int leftArrayLength=mid-l+1;
		int rightArrayLength=h-mid;
		
		int [] leftArray=new int[leftArrayLength];
		int [] rightArray=new int[rightArrayLength];
		
		//copying the array to tempery array
		for (int i = 0; i < leftArrayLength; i++) {
			leftArray[i]= array[l+i];
		}
		for (int j=0; j < rightArrayLength;j++) {
			rightArray[j]=array[mid+1+j];
		}
		
		
		// initialize indexes
		int i = 0, j = 0; 
		int k=l;
		while(i<leftArrayLength&&j<rightArrayLength) {
			if(leftArray[i]<=rightArray[j]) {
				array[k]=leftArray[i];
				i++;
			}
			else
			{
				array[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		//Copy remaining elements
		  while (i < leftArrayLength) 
	        { 
	            array[k] = leftArray[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < rightArrayLength) 
	        { 
	            array[k] = rightArray[j]; 
	            j++; 
	            k++; 
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
