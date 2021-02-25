package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.print("국어 >> ");
			String strKor = scan.nextLine();
			scVO.setIntKor(strKor); = strKor;
			
			int intKor = Integer.valueOf(strKor);


			System.out.println("숫자만 입력하세요");
			continue;

		} // while end

	} // main end
} // class end
