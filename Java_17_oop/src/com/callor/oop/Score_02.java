package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_02 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("=========================");
		System.out.println("성적관리 시스템 V1");
		System.out.println("========================");
		
		while (true) {

			System.out.print("국어 >> ");
			String strKor = scan.nextLine();

			try {
				int intKor = Integer.valueOf(strKor);
				scVO.setIntKor(strKor) = intKor;

			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}

		} // while end

	} // main end
} // class end
