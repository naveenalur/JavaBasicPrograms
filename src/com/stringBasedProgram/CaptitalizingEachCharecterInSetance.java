package com.stringBasedProgram;

public class CaptitalizingEachCharecterInSetance {

	public static void main(String[] args) {
		String st = "NaveAn is a good boy";
		char[] charArray = st.toCharArray();
		st = "";
		for (int i = 0; i < charArray.length; i++) {

			if (i == 0 && charArray[i] != ' ' || charArray[i] != ' ' && charArray[i - 1] == ' ') {
				if (charArray[i] >= 'a' && charArray[i] <= 'z') {

					charArray[i] = (char) (charArray[i] - 32);

				}

			} else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
				charArray[i] = (char) (charArray[i] + 32);
			}
			st = st + charArray[i];

		}
		System.out.println(st);
	}
}
