package com.muskan;

public class LargestNum {
	
	int findLargest(int a, int b) {
		if (a>b){
			return a ;
		}else {
			return b ;
		}
	}
	
	public static void main(String[] args) {
		LargestNum num = new LargestNum();
		System.out.println("Largest Number is "+num.findLargest(34, 43));
	}
}
