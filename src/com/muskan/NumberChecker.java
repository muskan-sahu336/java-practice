package com.muskan;

import java.util.Scanner;

public class NumberChecker {
	void checkEvenOdd(int num) {
		if (num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}
	
	public static void main(String[] args) {
		NumberChecker num = new NumberChecker();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter Number: ");
		int n = sc.nextInt();
		num.checkEvenOdd(n);
	}
}
