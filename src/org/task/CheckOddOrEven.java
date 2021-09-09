package org.task;

import java.util.Scanner;

public class CheckOddOrEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int nextInt = scan.nextInt();

		if (nextInt % 2 == 0) {
			System.out.println("this even number");
		}

		else {
			System.out.println("this is add number");
		}

	}
}
