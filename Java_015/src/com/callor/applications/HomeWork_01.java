package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2_1;

public class HomeWork_01 {

	public static void main(String[] args) {

		int[] intNums = new int[10];
		PrimeServiceV2_1 psV2 = new PrimeServiceV2_1();
		Random rnd = new Random();

		int index = 0;
		for (index = 0; index < intNums.length; index++) {
			intNums[index] = rnd.nextInt(10) + 2;
		} // 배열에 임의의 정수 10개를 담음

		psV2.prime(intNums[index]);

		int[] intSum = new int[10];
		int result = psV2.prime(intNums[index]);
		for (index = 0; index < intNums.length; index++) {
			if (result < 0) {

			} else {
				result += psV2.prime(intNums[index]);
			}

		}
		System.out.println(result);
	}
}
