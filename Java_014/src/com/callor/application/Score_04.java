package com.callor.application;

import java.util.Random;

public class Score_04 {
	public static void main(String[] args) {

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[100];
		int[] intEng = new int[100];
		int[] intMath = new int[100];

		Random rnd = new Random();

		int index = 0;

		for (index = 0; index < 3; index++) {

			intKor[index] = rnd.nextInt(100) + 1;

			intEng[index] = rnd.nextInt(100) + 1;

			intMath[index] = rnd.nextInt(100) + 1;

		}
		System.out.println("================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("--------------------------------");

		for (int dex = 0; dex < 3; dex++) {
			System.out.printf(strName[dex] + "\t" + intKor[dex] + "\t" + intEng[dex] + "\t" + intMath[dex] + "\n");
		}
	}
}
