package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int[] intNums = new int[100];

		for (int index = 0; index < intNums.length; index++) {
			intNums[index] = rnd.nextInt(10) + 1;
			// 배열에 1 ~ 10 랜덤수를 저장
		} // for end

		System.out.print("번호 입력 >>");
		int keyScan = scan.nextInt();
		// 키보드로 입력

		for (int index = 0; index < intNums.length; index++) {
			if (intNums[index] == keyScan) {
				System.out.printf("%d 번째 위치\n", index);
				break;
				
			} // if end
		} // for end
	} // method end
} // class end
