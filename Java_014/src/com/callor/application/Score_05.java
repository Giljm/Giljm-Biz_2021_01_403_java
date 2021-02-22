package com.callor.application;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		String strN = new String();

		Random rnd = new Random();
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] sum = new int[10];
		float[] Avg = new float[10];

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };

		int index = 0;
		for (index = 0; index < 3; index++) {

			intKor[index] = rnd.nextInt(100) + 1;

			intEng[index] = rnd.nextInt(100) + 1;

			intMath[index] = rnd.nextInt(100) + 1;

		}
		for (index = 0; index < 3; index++) {
			sum[index] = intKor[index];
			sum[index] += intEng[index];
			sum[index] += intMath[index];

		}
		for (index = 0; index < 3; index++) {
			Avg[index] = sum[index] / 3f;
		}

		System.out.print(strName[0] + "\t" + intKor[0] + "\t" + intEng[0] + "\t" + intMath[0] + "\n");
		System.out.print(strName[1] + "\t" + intKor[1] + "\t" + intEng[1] + "\t" + intMath[1] + "\n");
		System.out.print(strName[2] + "\t" + intKor[2] + "\t" + intEng[2] + "\t" + intMath[2] + "\n");

//		for (index = 0; index < 3; index++) {
//
//			System.out.print(strName[index] + "\t");
//			System.out.print(intKor[index] + "\t");
//			System.out.print(intEng[index] + "\t");
//			System.out.print(intMath[index] + "\t");
//			System.out.print(sum[index] + "\t");
//			System.out.printf("%3.2f\n", Avg[index]);			
//		}
	}
}
