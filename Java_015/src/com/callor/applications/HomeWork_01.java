package com.callor.applications;

import com.callor.applications.service.PrimeServiceV2;

import java.util.Random;

public class Homework_01 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int[] intNum = new int[100];

		int index = 0;
		for (index = 0; index < intNum.length; index++) {
			intNum[index] = rnd.nextInt(150) + 1;
		}

		int[] result = new int[100];
		for (index = 0; index < intNum.length; index++) {
			result[index] = psV2.prime(intNum[index]);
		}

		for (index = 0; index < intNum.length; index++) {

			if (result[index] < 0) {

			} else {
				System.out.printf("%d은(는) 소수다\n", result[index]);
			}
		}

		int sum = 0;
		for (index = 0; index < intNum.length; index++) {
			if (result[index] < 0) {

			} else {
				sum += result[index];
			}
		}

		System.out.println("========================");
		System.out.println("소수들의 합 : " + sum);

	}
}