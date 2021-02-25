package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String[] args) {

		Integer.valueOf("3");
		//Integer.valueOf("");

		// try catch : 예외처리
		try {
			Integer.valueOf("");
		} catch (NumberFormatException e) {
			System.out.println("null 값은 숫자로 변환할 수 없음");
		}

		// boolean bYes = 3 == "3";
		// if(3 == "3") {}
		// if문을 이용해서 찾을 수 없다.

		Scanner scan = new Scanner(System.in);
		System.out.println("0 이상의 정수를 입력하세요");
		System.out.println(">> ");
		String strNum = scan.nextLine();
		int intNum = Integer.valueOf(strNum);

		
		 System.out.println("====================");
		 
		// try catch : 예외처리
		try {
			if (intNum < 0) {
				System.out.println("정수 0이상 입력하세요");
			} else {
				System.out.println("입력한 정수 : " + intNum);
			}
			Integer.valueOf("");
		} catch (Exception e) {
			System.out.println("null 값은 숫자로 변환할 수 없음");
		}

	}
}
