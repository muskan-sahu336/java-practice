package com.muskan;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i<=10){
			System.out.println(n+" x "+i+" = "+(n*i));
			i++;
		}
	}
}
