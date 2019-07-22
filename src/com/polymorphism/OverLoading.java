package com.polymorphism;

public class OverLoading {
	
public static void main(String[] args) {

	System.out.println(Addition.Add(10));
	System.out.println(Addition.Add(23,4343));
}
}
class Addition{
	static int Add(int a) {
		return a;
	}
	static int Add(int b,int a) {
		return a+b;
	}
}

