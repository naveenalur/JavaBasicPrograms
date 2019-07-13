package com.stringBasedProgram;

public class RemovingDuplicatesFromString {
	public static void main(String[] args) {
		 String str="Naveen is Good Boy";
		 char[] charArray=str.toCharArray();
		 for (int i = 0; i < charArray.length-1; i++) {
			for (int j = i+1; j < charArray.length-1; j++) {
				if(charArray[i]==charArray[j]) {
					charArray[j]='0';
				}
			}
		}
		 StringBuilder resultantString=new StringBuilder();
		 for (int i = 0; i < charArray.length; i++) {
			 if(charArray[i]!='0') {
			 resultantString.append(charArray[i]);
			 }
		}
		 System.out.println("Before Removing the Duplicates... "+str);
		 System.out.println("After Removing DUplicates..."+resultantString);
		 
	}

}
