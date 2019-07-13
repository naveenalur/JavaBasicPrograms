package com.stringBasedProgram;

public class WordCountInString {
	public static void main(String[] args) {
		String Name="Navee            is a good boy";
		char[] charArray=Name.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) {
			if(i==0 && charArray[i]!=' '||charArray[i]!=' '&&charArray[i-1]==' ') {
				count++;
			}
		}
		System.out.println("The number of word present in string..."+count);
	}

}
