package com.callor.applications;

import java.util.Random;

public class Array_02 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];

		int intSum = 0;
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			intSum += intNum[i];
		}
		System.out.println("합계 : " + intSum);

		int intEven = 0;
		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0)
				intEven += intNum[i];
		}
		System.out.println("짝수만의 합계 : " + intEven);
	}
}
