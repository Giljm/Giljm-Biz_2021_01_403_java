package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 *  ScoreServiceV4 : Parent(부모) 클래스
 *  ScoreServiceExtendsV1 : child(자식) 클래스
 *  
 *  단순한 extends
 *  	부모 클래스에 정의된 모든 method를
 *  	코드 한 줄 추가, 수정 없이 그대로 사용할 수 있다.
 *  
 *  추가 extends
 *  	부모 클래스에 정의된 method와
 *  	새롭게 추가된 method가 있는
 *  	확장된 클래스의 생성
 */

public class ScoreServiceExtendsV1 extends ScoreServiceV4 {


	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */

	
	
	// 클래스안에 input이라는 method(함수)를 선언
	// JDK에 있는 Scanner 라는 클래스를 Import(불러오기)해서 사용
	// 키보드를 통해 콘솔창에 입력
	public int input(String subject) { // return을 사용하기 위해서는 int 코드를 사용해야 한다.
		Scanner scan = new Scanner(System.in);

		int intScore = 0; // intScore는 변수 0을 선언, 초기화.
		while (true) { // 실행되는 문이 트루일경우 무한 반복

			// 입력한 문자 값을 출력하고, intScore라는 변수에 저장
			System.out.println(subject + "점수 입력 >> ");
			intScore = scan.nextInt();

			// intScore에 저장된 값을 if문의 조건식에 대입하여 입력된 조건식이 true일 경우 실행해라.
			// if문의 조건식이 true일 경우 아래의 메세지를 출력
			if (intScore < 0) {
				System.out.println(subject + "점수는 0점 이상 입력!!");

			// if문의 조건식이 fales 일 경우 else if문을 실행,
			//실행하여 안의 조건문이 true일 경우 아래의 메세지를 출력
			} else if (intScore > 100) {
				System.out.println(subject + "점수는 100점 이하 입력!!");

			// if와 else if문의 조건식을 둘 다 만족하지 못했을 경우에 while 값을 멈춰라.
			} else {
				break;
			}
		}
		// 입력한 점수 : 라는 문장과 intScore의 값을 더해서 출력해라.
		// System.out.println("입력한 점수 : " + intScore);
		return intScore;
		
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
		
	}
}
// ScoreServiceV4의 Score와 print method 만을 사용했을 경우,
// 0 ~ 100 이외의 값을 입력해도 값이 나오기 때문에 사용자에게 명확성을 전달하기 위해 input이라는 method를 만듬




