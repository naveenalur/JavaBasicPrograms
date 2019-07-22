package com.ExceptionHandling;

public class HandlerClass {
	static void validate(int age) throws   SimpleAgeException{
		if(age< 18)
		{
		 throw new SimpleAgeException("Invalid age");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		try {
			validate(12);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
