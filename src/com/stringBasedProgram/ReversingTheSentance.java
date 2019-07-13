package com.stringBasedProgram;

public class ReversingTheSentance {
	public static void main(String[] args) {
		String str="Naveen is good boy";
		char [] charArra=str.toCharArray();
		str="";
		for (int i = charArra.length-1; i >=0 ; i--) {
			int k=i;
			while(i>=0&&charArra[i]!=' ') {
				i--;
			}
			int j=i+1;
			while(j<=k) {
				str=str+charArra[j];
				j++;
			}
			if(i>=0) {
				str=str+charArra[i];
			}
			
		}
		System.out.println(str);
	}

}
