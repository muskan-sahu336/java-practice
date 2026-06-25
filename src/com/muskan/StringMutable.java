package com.muskan;
// StringBuffer : a predefined java class used to create mutable string and it is thread safe (safe to use in multiple threads),slower.
// String builder : a predefined java class used to create mutable string and it is not thread-safe (not designed for multiple threads at same time),faster.
public class StringMutable {
	public static void main(String[] args) {
		String name = "JAVA";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Programming");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("Programming");
		System.out.println(sb2);
	}
}

