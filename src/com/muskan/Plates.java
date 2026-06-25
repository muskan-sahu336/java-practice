package com.muskan;

import java.util.Stack;

public class Plates {
	public static void main(String[] args) {
		Stack<String> plates = new Stack<String>();
		plates.add("plate 1");
		plates.add("plate 2");
		plates.add("plate 3");
		plates.add("plate 4");
		plates.add("plate 5");
		System.out.println("Original plates stack :"+plates);
		plates.pop();
		plates.pop();
		System.out.println("Updated plates Stacks :"+plates);
	}
}
