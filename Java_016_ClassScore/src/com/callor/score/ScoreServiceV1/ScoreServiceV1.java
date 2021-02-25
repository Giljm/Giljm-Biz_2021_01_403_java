package com.callor.score.ScoreServiceV1;

public class ScoreServiceV1 {

	// 3과목의 점수를 전달받아서
	// 합산을 하고 결과를 return 하는 method

	public int scoreSum(int intKor, int intEng, int intMath) {

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}

	// 총점 점수를 전달받고
	// 과목수(과목수 3개라고 가정) 3개로 나누어 return
	public float scoreAvg(int Sum) {
		return (float) Sum / 3;
	}

	// 한 학생의 데이터를 한 줄에 출력하는 코드
	public void scorePrint(String name, int intKor, int intEng, int intMath, int intSum, float floatAvg) {

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\n", name, intKor, intEng, intMath, intSum, floatAvg);
	}

	/*
	 * 배열을 매개변수로 받는 print() method
	 */
	public void print(String[] name, int[] intKor, int[] intEng, int[] intMath, int[] intSum, float[] floatAvg) {

		System.out.println("===========================");
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		System.out.println("---------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\n", name[i], intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
		}

	}

}