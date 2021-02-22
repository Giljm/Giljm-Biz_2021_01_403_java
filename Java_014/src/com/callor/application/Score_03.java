package com.callor.application;

import java.util.Scanner;

public class Score_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		int index = 0;

		for (index = 0; index < 3; index++) {

			System.out.print(strName[index] + "\n");

			System.out.println("점수를 입력하세요");

			System.out.print("국어 >> ");
			intKor[index] = scan.nextInt();

			System.out.print("영어 >> ");
			intEng[index] = scan.nextInt();

			System.out.print("국어 >> ");
			intMath[index] = scan.nextInt();

		}
		System.out.println("================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("--------------------------------");
		
		for(int dex = 0 ; dex < 3 ; dex++) {
			System.out.printf(strName[dex] + "\t" + intKor[dex] + "\t" + intEng[dex] + "\t" +intMath[dex] + "\n");
		}
		
//		System.out.println(strName[0] + "\t" + intKor[0] + "\t" + intEng[0] + "\t" + intMath[0] + "\n");		
//		System.out.println(strName[1] + "\t" + intKor[1] + "\t" + intEng[1] + "\t" + intMath[1] + "\n");
//		System.out.println(strName[2] + "\t" + intKor[2] + "\t" + intEng[2] + "\t" + intMath[2] + "\n");
		
		
		
		
		
	}
}
