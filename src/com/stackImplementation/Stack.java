package com.stackImplementation;

import javax.sound.midi.SysexMessage;

public class Stack {
	private int capacity;
	private int top;
	private int [] array;
	
	Stack(int size)
	{
		array=new int[size];
		capacity=size;
	}
	
	public  void push(int a) {
		
		if(isFull()) {
			System.out.println("Stack overflow..!");
			System.exit(0);
		}
	array[++top]=a;
		
	}
	
	public  boolean isFull() {
		return top==capacity-1;
	}
	
	public int peek() {
		return array[top-1];
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty please insert");
			System.exit(0);
		}
		return array[top--];
	}

	public boolean isEmpty() { 
		return top==-1;
	}
	public static void main(String[] args) {
		Stack stck=new Stack(5);
	
		stck.push(1);
		stck.push(12);
		stck.push(13);
		stck.push(12);
		
		
		System.out.println(stck.pop());
		
	}
}
