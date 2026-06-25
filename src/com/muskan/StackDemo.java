package com.muskan;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> book = new Stack<String>();
		
		book.push("JAVA");
		book.push("PYTHON");
		book.push("C++");
		
		System.out.println("Books in Stack :"+book);
		
		System.out.println("Top Book :"+book.peek());
		
		System.out.println("Removed Book :"+book.pop());
		
		System.out.println("Remaining Books :"+book);
	}
	
}
