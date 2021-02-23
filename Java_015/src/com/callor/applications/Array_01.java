package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 랜덤 클래스를 사용하여 rnd 객체를 선언하고
		// = new Random() 명령을 사용하여 rnd 객체를 인스턴스화(만든다)
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		int[] intNums = new int[100];
		int count = 0;

		// intNums.length 까지의 정수를 만들어서
		// intNums의 위치값으로 정하고
		// 1~ 10 까지의 임의 숫자를 생성하여
		// intNums의 배열에 채워 넣어라
		
		for (int index = 0; index < intNums.length; index++) {
			// Random 클래스의 nextInt() method를 호출하면서 정수 10을 전달하고
			// return 된 결과에 1을 더하라
			// 1 ~ 10 까지 중 임의 숫자 1개를 만들어라
			// 임의로 생성된 숫자를
			// intNums[i] 번째 위치에 에 저장하라
			intNums[index] = rnd.nextInt(10) + 1;
		} // 배열에 저장

		System.out.print("입력 >> ");
		int keyScan = scan.nextInt(); // 키보드로 입력

		for (int index = 0; index < intNums.length; index++) {
			if (intNums[index] == keyScan) {
				count++;
				System.out.printf("intNums[%d]\n", index);
			}
		}
		System.out.println("횟수 : " + count);
	}
}
