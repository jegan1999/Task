package org.task;

public class CountTheEvenNumbers {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 500; i++) {

			if (i % 2 == 0) {
				count++;
//				or
//				count = count + 1;

			}

			// //count Odd Numbers
			// if (i%2==1) {
			// count=count+1;
			// }
		}

		System.out.println(count);

	}

}
