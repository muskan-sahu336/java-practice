package com.muskan;

// String : immutable

public class StringClass {
	public static void main(String[] args) {
		String text = " hello java world";
		System.out.println("Original string :" + text);
		System.out.println("length :" + text.length());
		System.out.println("lowercase :" + text.toUpperCase());
		System.out.println("uppercase :" + text.toLowerCase());
		System.out.println("charaxter at index 4 :" + text.charAt(4));
		System.out.println("contains 'java' :" + text.contains("java"));
		System.out.println("starts with 'hello' :" + text.startsWith("hello"));
		System.out.println("index of java :" + text.indexOf("java"));
		System.out.println("ends with world :" + text.endsWith("world"));
		System.out.println("substring(6) :" + text.substring(6));
		System.out.println("substring(6,10) :" + text.substring(6,10));
		
		String s1 = "Java";
        String s2 = "Java";

        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + "JAVA".equalsIgnoreCase("java"));
        System.out.println("Replace: " + text.replace("Java", "Python"));
        System.out.println("Is Empty: " + text.isEmpty());
        String spaces = "   Java   ";
        System.out.println("Trim: '" + spaces.trim() + "'");
        String fruits = "Apple,Mango,Banana";
        String[] arr = fruits.split(",");
        System.out.println("Split Result:");
        
        for (String fruit : arr) {
            System.out.println(fruit);
        }
        
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Join: " + joined);
        System.out.println("Repeat: " + "Hi ".repeat(3));
    }
}
 