package com.callor.application;

import java.util.Scanner;

public class Score_01 {
	public static void main(String[] args) {

		// 배열이 나타나면 일단 for 반복문이 한 번 쯤은 나타난다.
		// 학생 3명의 3과목의 점수를 어떻게 입력받을 것인가?
		// 학생 3명의 과목 점수를 어떻게 출력할 것인가

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		// 필요한 []개수만큼 배열을 만들어라
		int[] intSum = new int[5];
		int[] intAvg = new int[100];

		Scanner scan = new Scanner(System.in);
		// 3명 학생의 과목 성적 입력받기
		// 1. 국어 과목의 3학생 점수를 입력받기
		// 2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기

		// 1. 과목별로 학생 점수 입력받기

		// 학생 인원수가 몇 명 안될때는 아래 처럼 단순하게 작성해도 된다.
		System.out.println("국어 점수");
		System.out.print("1번 학생");
		intKor[0] = scan.nextInt();

		System.out.print("2번 학생");
		intKor[1] = scan.nextInt();

		System.out.print("3번 학생");
		intKor[2] = scan.nextInt();

		// for() 반복문을 이용하여 반복되는(복사 & 붙이기) 코드를 단순하게 만든다
		System.out.println("영어 점수");
		for (int index = 0; index < intEng.length; index++) {
			int num = index + 1;
			System.out.println(num + "번 학생 >>");
			intEng[index] = scan.nextInt();
		}
		System.out.println("수학 점수");
		for (int index = 0; index < intEng.length; index++) {
			int num = index + 1;
			System.out.println(num + "번 학생 >>");
			intMath[index] = scan.nextInt();
		}

		System.out.println("======================");
		System.out.println("국어" + "\t" + "영어" + "\t" + "수학");
		System.out.println("----------------------");
		
		for (int i = 0 ; i < intKor.length ; i++) {
				System.out.printf("%d\t%d\t%d\n",intKor[i],intEng[i],intMath[i]);
		}

		System.out.println(intKor[0] + "\t" + intEng[0] + "\t" + intMath[0]);
		// System.out.println(intKor[1] + "\t" + intEng[1] + "\t" + intMath[1]);
		// System.out.println(intKor[2] + "\t" + intEng[2] + "\t" + intMath[2]);
	}
}
