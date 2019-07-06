package com.StringPolidrome;

public class StringPolindromeUsingRecurrsion {
	public static void main(String[] args) {
		
	}
	
	public static boolean IsPolindrome()
	{
		//String reverse=
		return false;
	}
	
	public static String reverse(String input) {
		
		if(input==null|| input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));
		
	}
}
