package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		// 100개의 요소를 저장 할 수 있는 100개의 배열 선언
		Random rnd = new Random();

		for (int index = 0; index < intNums.length; index++) {
			intNums[index] = rnd.nextInt(100) + 1;
			// 배열에 1 ~ 100을 100개의 배열 공간에 저장
		}

		int intsum = 0;

		for (int index = 0; index < intNums.length; index++) {
			if (intNums[index] % 3 == 0 && intNums[index] % 5 == 0) {
				intsum += intNums[index];
			}
		}// 3과 5의 배수 합 저장
		
		for (int index = 0; index < intNums.length; index++) {
			if (intNums[index] % 3 == 0 && intNums[index] % 5 == 0) {
				System.out.printf("랜덤으로 나온\n\n3과 5의 배수 : %d\n", intNums[index]);
			}
		}// 랜덤으로 나온 3과 5의 배수 값
		
		System.out.printf("3과 5의 배수의 합 : %d  ",intsum);

	}
}