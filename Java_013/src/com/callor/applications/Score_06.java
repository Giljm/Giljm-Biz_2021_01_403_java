package com.callor.applications;

import java.util.Scanner;

public class Score_06 {
	public static void main(String[] args) {

		String[] strSubject = new String[3];
		strSubject[0] = "국어";
		strSubject[1] = "영어";
		strSubject[2] = "수학";
		
		int[] intScore = new int[3];
		Scanner scan = new Scanner(System.in);
		
		int intSum = 0;
		System.out.print("과목의 성적을 입력하세요.\n");
		for (int i = 0; i < 3; i++) {
			System.out.println(strSubject[i] + " >> ");
			intScore[i] = scan.nextInt();
			intSum += intScore[i];

		}System.out.println("합계 : " + intSum);
	}
}
