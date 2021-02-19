package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// 클래스 영에 선언된 변수들
	// 클래스 영역 : 멤버 영역
	// 인스턴스 변수
	// ScoreServiceV1 scoreServiceV1; : 클래스를 객체로 선언
	// = new ScoreServiceV1(); 객체의 초기화
	// 인스턴스 : 객체가 초기화 되면
	// 자동으로 사용할 준비가 되는 변수들
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;
	private Scanner scan = new Scanner(System.in);

	public void input() {

		// input() method의 (멤버변수)지역변수
		System.out.print("국어점수 >> ");
		intKor = scan.nextInt();
		System.out.print("영어점수 >> ");
		intEng = scan.nextInt();
		System.out.print("수학점수 >> ");
		intMath = scan.nextInt();
	}

	public void sum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
	}

	public void avg() {
		floatAvg = intSum / 3.0F;
	}

	// 인스턴스변수에 저장된 값을 출력
	//
	public void print() {
		sum();
		avg();
		System.out.print("국어 : " + intKor + " 영어 : " + intEng + " 수학 : " + intMath + "\n");
		System.out.printf("총점 : %d " + "\n" + "평균 : %s", intSum, floatAvg);

	}
}
