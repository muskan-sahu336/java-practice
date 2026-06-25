package com.muskan;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks :");
		int marks = sc.nextInt();
		if (marks >= 90) {
			System.out.println("Grade A");
		}else if(89 >= marks && marks >= 75) {
			System.out.println("Grade B");
		}else if(74 >= marks && marks >= 50) {
			System.out.println("Grade B");
		}else {
			System.out.println("Grade B");
		}
	}
}

//90+ → A Grade
//75-89 → B Grade
//50-74 → C Grade
//Below 50 → Fail
