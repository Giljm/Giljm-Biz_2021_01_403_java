package com.callor.application;

import java.util.Scanner;

public class Score_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		for (int index = 0; index < 3; index++) {
			System.out.print("학생 이름 입력 >> ");
			strName[index] = scan.nextLine();

			String strSubj = scan.nextLine();
			Integer.valueOf(strSubj);

			System.out.println("과목 점수 입력");

			System.out.print("국어 >> ");
			intKor[index] = Integer.valueOf(strSubj);

			System.out.print("영어 >> ");
			intEng[index] = Integer.valueOf(strSubj);

			System.out.print("수학 >> ");
			intMath[index] = Integer.valueOf(strSubj);

		}
		System.out.println("==============================");
		System.out.println("국어\t영어\t수학");
		System.out.println("------------------------------");
		for (int index2 = 0; index2 < 3; index2++) {
			System.out.printf("%d\t%d\t%d\n", intKor[index2], intEng[index2], intMath[index2]);
		}
	}
}