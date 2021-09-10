package org.task;

import java.util.Scanner;

public class BiggestOfThreeNum {
	
	private void method() {
		System.out.println("kjgjhgjh");
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a>b) {
			System.out.print(a+" "+"this is biggest");
		}
		
		else if (b>c) {
			System.out.println(b+" "+" is biggest");
		}
		
		else if (c>a) {
			System.out.println(c+" "+" is biggest");
		}
		
	}

}
