package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("=======================");

		System.out.println("학생 이름을 입력하세요");
		System.out.println(">> ");
		String strName = scan.nextLine();
		scVO.strName = strName;

		while (true) {

			System.out.print("국어 >> ");
			String strKor = scan.nextLine();
			scVO.setIntKor(strKor);

			// intKor에 -1이 담겨 있으면
			// 다시 입력을 하도록해야 한다
			if (scVO.getIntKor() < 0) {
				System.out.println("국어점수 유효성 검사 실패");
				continue;
			}
			break;
		} // while end

		while (true) {

			System.out.print("영어 >> ");
			String strEng = scan.nextLine();
			scVO.setIntEng(strEng);

			if (scVO.getIntEng() < 0) {
				System.out.println("영어점수 유효성 검사 실패");
				continue;
			}
			break;
		} // while end

	} // main end
} // class end
