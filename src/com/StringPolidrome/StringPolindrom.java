package com.StringPolidrome;

public class StringPolindrom {
	public static void main(String[] args) {
		String originalString="ANAer";
		if(IsPolindrome(originalString)) {
			System.out.println("The String is polindrome");
		}
		else
		{
			System.out.println("The string is not a polindrome");
		}
		
	}
	
	public static boolean IsPolindrome(String OriginalString)
	{
		char[] CharArray=OriginalString.toCharArray();
		String tempString="";
		for(int i=(CharArray.length-1);i>=0;i--) {
			tempString=tempString+CharArray[i];
		}
		if(tempString.equals(OriginalString)) return true;
		
		else
		{
			return false;
		}
	
		
	}
	

}
