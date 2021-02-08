package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {

		int num1 = 0;

		for (int sw = 1; sw <= 100; sw++) {

			if (sw % 2 == 0) { // 남은값이 0이냐 1이냐를 이용해서 짝수와 홀수를 구분하게 한다.
				num1 += sw; // 값을 누적한다.
			}
		}
		System.out.println("짝수의 합 : " + num1);

		// 위에서 선언하고 사용했던 변수를 "재사용"
		// 반드시 초기화 해야함.
		int num2 = 0;

		for (int sw = 1; sw < 100; sw++) {

			boolean bYes = sw % 2 == 0;

			if (!bYes) {
				num2 += sw;

			}
		}
		System.out.println("홀수의 합 : " + num2);
	}

}
