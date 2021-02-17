package com.callor.applications.service;

public class ScoreServiceV4 {

	// 총점과 평균을 전달받는 2개의 매개변수가 있는 score() 메서드
	// 총점과 평균을 매개변수로 전달받아서 Console에 총점과 평균 출력
	public void score(int intSum, float Avg) {
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + Avg);
	}

	public void print(int intKor, int intEng, int intMath) {
		
		int sum = 0;
		sum = intKor;
		sum += intEng;
		sum += intMath;
		
		System.out.println("===============================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------");
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(sum + "\t");
		
		double bYes2 = ((intKor + intEng + intMath) / 3.0);
				
		System.out.println((float)bYes2 + "\t");
		System.out.println("===============================");
	}

}
