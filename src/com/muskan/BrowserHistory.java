package com.muskan;

import java.util.Stack;

public class BrowserHistory {
	public static void main(String[] args) {
		Stack<String> websites = new Stack<String>();
		websites.add("Google");
		websites.add("Javapoint");
		websites.add("W3Schools");
		websites.add("GFG");
		websites.add("Yahoo");
		System.out.println("Current page : "+websites.peek());
		websites.pop();
		System.out.println("Websites History : "+websites);
		
	}
}
