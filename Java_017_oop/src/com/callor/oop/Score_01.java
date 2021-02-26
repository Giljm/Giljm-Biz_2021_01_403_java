package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_01 {

	public static void main(String[] args) {

		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("=======================");

		while (true) {
			System.out.println("학생 이름을 입력하세요");
			System.out.print(">> ");
			String strName = scan.nextLine();
			scoreVO.strName = strName;

			while (true) {
				System.out.println("국어점수를 입력하세요");
				System.out.print(">> ");
				String strKor = scan.nextLine();
				try {
					int intKor = Integer.valueOf(strKor);
					scoreVO.setIntKor(strKor);
					break;

				} catch (Exception e) {
					System.out.println("숫자만 입력하세요");
					continue;
				}
			}

			System.out.println("영어점수를 입력하세요");
			System.out.print(">> ");
			String strEng = scan.nextLine();

			System.out.println("수학점수를 입력하세요");
			System.out.print(">> ");
			String strMath = scan.nextLine();

		}

	} // while end

} // main end
// class end
