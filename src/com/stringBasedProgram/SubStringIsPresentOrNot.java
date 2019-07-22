package com.stringBasedProgram;

public class SubStringIsPresentOrNot {
	
	public static void main(String[] args) {
		String str1="Naveen Is good";
		String str2="Naveen ";
		System.out.println(IsSubStringPresentOrNot(str1, str2));
	}
	private static boolean IsSubStringPresentOrNot(String string1,String string2) {
		
		char [] charArray1=string1.toCharArray();
		char [] charArray2=string2.toCharArray();
		
		for (int i = 0; i < charArray2.length; i++) {
			int k=i;
			int j=0;
			while(k<charArray1.length&&j<charArray2.length&&charArray1[k]==charArray2[j]) {
				k++;
				j++;
			}
			if(j==charArray2.length&&(i==0||charArray1[i-1]==' ')&& (k==charArray1.length&&charArray1[k]==' '))
			{
				return true;
			}
			
		}
		
		return false;
	}
	

}
