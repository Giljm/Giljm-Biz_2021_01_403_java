package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int index = 0; index < intNums.length; index++) {
			intNums[index] = rnd.nextInt(10) + 1;
		} // 값 저장

		System.out.print("번호 입력 >>");
		int keyScan = scan.nextInt();
		// 키보드로 입력

		for (int index = 0; index < intNums.length; index++) {
			boolean bYes = intNums[index] == keyScan;
			// 키보드로 입력한 값과 배열에 저장된 값이 일치하는지 찾아내는 코드

			if (bYes) {
				System.out.printf("intNums[%d] 번째에 저장\n", index);
				// if문 안에 넣어야 if문을 실행,
				// 출력에 배열의 저장값과 index라는 배열 번호를 같이 넣어서 출력
			} // if end
		} // for end
	}
}
