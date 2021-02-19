package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {
	public static void main(String[] args) {
		ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1();

		scoreServiceV1.input();
		scoreServiceV1.print();

	}
}

// method return 값을 변수에 담기(저장) 하려면
// method return type이 void 