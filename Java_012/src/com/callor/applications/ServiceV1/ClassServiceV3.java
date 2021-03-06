package com.callor.applications.ServiceV1;

import java.util.Scanner;

public class ClassServiceV3 {

	private int Num1 = 0;
	private int Num2 = 0;
	private Scanner scan = new Scanner(System.in);

	/*
	 * scope() 에서는 1개의 숫자를 키보드에서 입력받아 변수 intNum1에 저장한다 하지만 여기에서 선언된 intNum1은 클래스 영역에
	 * 선언된 인스턴스변수와는 이름만 같지 완전히 다른 변수다. 따라서 scope() method가 종료된 이후에는 변수값에 접근할 수 없다.
	 * scope() method에서 선언된 intNum1 변수를 지역변수라고 한다.
	 */
	public void scope() {
		int intNum1 = scan.nextInt();
	}

	public void input() {
		System.out.print(" >> ");
		Num1 = scan.nextInt();

		System.out.print(" >> ");
		Num2 = scan.nextInt();

	}

	public void algebra() {
		System.out.println(Num1 + " + " + Num2 + " = " + (Num1 + Num2));
		System.out.println(Num1 + " - " + Num2 + " = " + (Num1 - Num2));
		System.out.println(Num1 + " * " + Num2 + " = " + Num1 * Num2);
		System.out.println(Num1 + " / " + Num2 + " = " + Num1 / Num2);

		/*
		 * print formatting 명령문 "" 안에 문자열을 작성하여 출력문을 만드는 명령문 %d(Decimal) 위치에 정수값을 대신
		 * 부착하여 출력문 생성
		 */
		System.out.printf("%d + %d = %d \n", Num1, Num2, Num1 + Num2);

		System.out.printf("%d - %d = %d \n", Num1, Num2, Num1 - Num2);
		
		System.out.printf("%d x %d = %d \n", Num1, Num2, Num1 * Num2);
		
		System.out.printf("%d /\t %d = %d \n", Num1, Num2, Num1 / Num2);
	}
}









