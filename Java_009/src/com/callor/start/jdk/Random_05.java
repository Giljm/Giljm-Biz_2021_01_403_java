package com.callor.start.jdk;

import java.util.Random;

/*
 * for (int i = 0; i < 100; i++)
 * Random 클래스를 이용
 * 
 * 1 ~ 100 까지 임의의 숫자 100개를 만들고
 * 100개 중에 짝수가 있으면 짝수들의 합을 계산
 * 
 */

public class Random_05 {

	public static void main(String[] args) {
		
		int Sum = 0;
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 1;
			boolean bYes = num % 2 == 0;

			if (bYes) {
				// num가 짝수면 실행.
				// num 값을 다른 변수에 누적.

				Sum += num;

				System.out.println(num);

			}
		}
		System.out.println("짝수의 합 : " + Sum);
	}
}

/*
 * int num = 0;
 * 
 * Random rnd = new Random();
 * 
 * for (int i = 0; i < 100; i++) {
 * 
 * int num = rnd.nextInt(100) + 1;
 * 
 * boolean bYes = num % 2 == 0;
 * 
 * if (bYes) { num += num1;
 * 
 * }
 * 
 * } System.out.println("1~100 짝수들의 합 : " + num);
 * 
 * } }
 */
