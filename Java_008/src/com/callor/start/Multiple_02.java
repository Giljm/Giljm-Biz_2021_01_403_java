package com.callor.start;

public class Multiple_02 {

	public static void main(String[] args) {

		int odd = 0;

		for (int i = 0; i < 100; i++) {

			int num1 = i + 7;

			boolean bYes = num1 % 3 == 0;

			if (!bYes) {

				System.out.println(num1);

				odd += num1;
			}

		}
		System.out.println("총 합 : " + odd);
	}
}
