package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;
		System.out.println(num);

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int intNum1 = scan.nextInt();

		// 1. keyNum > num1 이냐?
		// 		맞으면 "큰 값" 표시하고 종료
		if (num > intNum1) {
			System.out.println("큰 값");
		// 2. 그렇지 않으면 keyNum < num1 이냐?
		// 		맞으면 "작은 값" 표시하고 종료
		} else if (num == intNum1) {
			System.out.println("작은 값");
		// 3. 그렇지 않으면 KeyNum == num1 이냐?
		// 		맞으면 "같다" 표시하고 종료
		} else if (num < intNum1) {
			System.out.println("같음");
		}

	}

}
