package org.task;

public class Task {
	
	public void method(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Task t=new Task();
		t.method(10, -25);
	}
	

}
