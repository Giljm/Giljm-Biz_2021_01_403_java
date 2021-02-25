package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		String[] intName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] intAdd = { "서울시", "익산시", "남원시", "한양시", "함흥시" };
		int[] intKor = new int[intName.length];
		int[] intEng = new int[intName.length];
		int[] intMath = new int[intName.length];
		int[] intSum = new int[intName.length];
		float[] intAvg = new float[intName.length];
		int index = 0;
		
		for (index = 0; index < intName.length; index++) {
			intKor[index] = rnd.nextInt(100) + 1;
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;
		} // 배열로 지정해 놓은 국, 영, 수의 0 ~ 9 공간에 intName의 배열 횟수만큼 랜덤값을 지정.
		
		System.out.println("=======================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");

		for (index = 0; index < intName.length; index++) {
			intSum[index] = intKor[index];
			intSum[index] += intEng[index];
			intSum[index] += intMath[index];
		}

		for (index = 0; index < intName.length; index++) {
			intAvg[index] = ((intKor[index] + intEng[index] + intMath[index]) / 3.0f);
		}

		for (index = 0; index < intName.length; index++) {
			System.out.print(intName[index] + "\t");
			System.out.print(intAdd[index] + "\t");
			System.out.print(intKor[index] + "\t");
			System.out.print(intEng[index] + "\t");
			System.out.print(intMath[index] + "\t");
			System.out.print(intSum[index] + "\t");
			System.out.printf("%3.2f\n", intAvg[index]);
		}
		System.out.println("=======================================================");

	} // main method end
} // class end
