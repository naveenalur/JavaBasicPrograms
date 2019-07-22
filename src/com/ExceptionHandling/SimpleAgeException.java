package com.ExceptionHandling;

public class SimpleAgeException extends RuntimeException {

	SimpleAgeException(String s){
		super(s);
		//System.out.println(s);
	}
}
