package com.callor.score;

import com.callor.score.model.ScoreVO;

public class Score_05 {

	public static void main(String[] args) {

		int num;
		num = 0;
		System.out.println(num);

		// ScoreVO 클래스를 사용하여
		// scoreVO 객체(인스턴스) 생성

		ScoreVO scoreVO = new ScoreVO();

		scoreVO.strName = "홍길동";
		scoreVO.intKor = 90;
		scoreVO.intEng = 100;
		scoreVO.intMath = 88;

		/*
		 * 클래스로 객체를 선언만 한 상태에서는 아무런 것도 사용할 수 없다.
		 */
		
		ScoreVO scoreVO1;
		scoreVO1 = new ScoreVO();
		scoreVO1.intKor = 100;

		// ScoreVO 클래스를 사용하여 scoreVO2 객체 선언
		// 객체를 인스턴스로 생성(초기화)
		// java 에서는 new ScoreVO() 코드를
		// 클래스의 "생성자(method) 호출" 이라고 부른다.
		// ScoreVO 클래스를 scoreVO2 객체를 선언하고
		// 생성자를 호출하여 인스턴스로 만들었다.
		ScoreVO scoreVO2 = new ScoreVO();

	}
}
