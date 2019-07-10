package com.dulicatesRemoving;

public class SortFirstRemoveNext {

	public static int removeDuplicateElement(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        temp[j++] = arr[n-1];   
         
        // Changing original array
        for (int i=0; i<j; i++)
        	arr[i] = temp[i];
      
        return j;
    }
	
	public static int[] SortArray(int array[]) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		return array;
	}
     
    public static void main (String[] args) 
    {
        int arr[] = {30,10,20,20,30,30,40,40,50,50};
        int length = arr.length;
         int[] sortedArray=new int[arr.length];
         sortedArray=SortArray(arr);
         System.out.println(sortedArray.length);
         System.out.println("Sorted Elements");
         for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
        length = removeDuplicateElement(sortedArray, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(sortedArray[i]+" ");
    }
}
