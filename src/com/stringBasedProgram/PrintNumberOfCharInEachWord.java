package com.stringBasedProgram;

public class PrintNumberOfCharInEachWord {
	
	public static void main(String[] args) {
	String data="He is a good boy ever seen";
	char[] ch=data.toCharArray();
	data="";
	for (int i = 0; i < ch.length; i++) {
		int count=0;
		while(i<ch.length&&ch[i]!=' ') {
			data=data+ch[i];
			count++;
			i++;
		}
		data=data+count;
	}
	System.out.println(data);
	
	}

}
