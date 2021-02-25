package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_02 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int[] num = new int[100];

		int index = 0;
		for (index = 0; index < num.length; /* 배열수만큼 */ index++) {
			num[index] = rnd.nextInt(150);
		} // 랜덤수 0 ~ 150을 배열 num 0 ~ 99까지 담는다.

		int sum = 0;
		for (index = 0; index < num.length; index++) {
			int result = psV2.prime(num[index]);
			// for문을 이용해서 psV2 클래스의 prime method()를 반복하고
			// result에 결과를 담는다
			if (result >= 2) { // result의 결과값 중 소수만 다음으로 진행
				sum += result;
				System.out.println("소수 : " + result);
				// 위에서 나온 result의 결과를 sum에 누적.
				// 누적은 for문을 통해 배열수만큼 계속 반복된다.
				// 나온 소수들만 출력 함
			}
		}
		System.out.println(sum + " : 합");

	}
}
