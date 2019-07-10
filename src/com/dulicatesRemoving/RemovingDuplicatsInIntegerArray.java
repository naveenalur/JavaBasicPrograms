package com.dulicatesRemoving;

public class RemovingDuplicatsInIntegerArray {
	public static void main(String[] args) {
		int [] integerArray= {12,2,3,3,2};
		
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
		
		System.out.println("Removing  the duplicates starts..!");
		
		
		int [] a=new int[integerArray.length];
		for (int i = 0; i < integerArray.length; i++) {
			for (int j = 0; j < integerArray.length-1; j++) {
				if(integerArray[i]!=integerArray[j]) {
					a[i]=integerArray[i];
					integerArray[j]=0;
				}
			}
		}
		System.out.println("After The removing ur duplicates");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
