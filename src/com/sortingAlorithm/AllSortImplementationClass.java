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


	public int[] MergeSort(int[] array,int l,int h) {
		//1.Calculate the middle of array
		if(l<h) {
			int mid=(l+h)/2;
			MergeSort(array, l, mid);
			MergeSort(array, mid+1, h);
			MergeArray(array, l, h, mid);
		}
		
		return array;
	}

	@Override
	public int[] QuickSort(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void PrintArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static int[] MergeArray(int [] array,int l,int h,int mid) {
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
		
		
		
		
		
		return array;
	}

}
