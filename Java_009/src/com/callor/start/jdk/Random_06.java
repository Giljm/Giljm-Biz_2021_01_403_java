package com.callor.start.jdk;

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		int Sum = 0;

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 1;

			boolean bYes = num < 34;

			if (bYes) {
				System.out.println(num + 1);
				break;
			}
		}

		int intEnd = 100;
		int count = 0;
		for (count = 0; intEnd <= 200; count++) {

			int num = rnd.nextInt(100) + 1;
			if (num > 50) {
				break;
			}
		}
		System.out.println(count);
		// count 변수값을 읽을 수 있다.
		// 만약 for 반복문이 중단되지 않고
		// 모두 정상적으로 수행되고나면
		// count와 intEnd는 count == intEnd가 된다.
		if (intEnd <= count) {
		}

		if (intEnd > count) {
			// for() 가 어떤 이유로 중간에 break 되었다.
			System.out.println("for중단");
			System.out.println((count +1 )+ "번째에서 값 발견");
		} else {
			System.out.println("for 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
		}
	}

}
