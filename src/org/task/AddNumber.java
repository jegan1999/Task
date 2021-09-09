package org.task;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int nextInt = scan.nextInt();
		// int i=30;

		if (nextInt % 2 != 0) {
			System.out.print("this is add number");
		}

	}
}
