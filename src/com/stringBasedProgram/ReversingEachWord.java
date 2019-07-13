package com.stringBasedProgram;

import java.util.Scanner;

public class ReversingEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentance");
		String str="Naveen is from alur";
		
		char charArray[]=str.toCharArray();
		System.out.println(charArray);
		str="";
		
		for (int i = 0; i < charArray.length; i++) {
			int k=i;
			while(i<charArray.length&&charArray[i]!=' ') {
				i++;
			}
			int j=i-1;
			while(j>=k) {
				str=str+charArray[j];
				j--;
			}
			if(i<charArray.length) {
				str=str+charArray[i];
			}
			
		}
		
		System.out.println(str);
	}

}
