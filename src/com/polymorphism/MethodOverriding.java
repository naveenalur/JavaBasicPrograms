package com.polymorphism;
public class MethodOverriding {
	
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal b=new Person();
		System.out.println(a.DisplayMessage());
		System.out.println(b.DisplayMessage());
	}
}

class Animal{
	 String DisplayMessage() {
		return this.getClass().getSimpleName();
	}
}
class Person extends Animal{
	 String DisplayMessage() {
		return this.getClass().getSimpleName();
	}
}