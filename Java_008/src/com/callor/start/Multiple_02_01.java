package com.callor.start;

public class Multiple_02_01 {

	public static void main(String[] args) {

		// ~ 범위의 값을 덧셈(합산, 누적) 용 변수 선언
		int intSum = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 1;
			if (bYes) {
				intSum += num;
			}

			boolean bYes2 = num % 3 == 2;
			if (bYes2) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);

		intSum = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0; // boolean bYes = num % 3 != 0;
			if (!bYes) {				 // if (bYes)
				intSum += num;

			}
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
	}
}
