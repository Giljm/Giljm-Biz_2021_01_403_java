package com.callor.application;

import com.callor.application.service.ScoreServiceV1;

public class Score_06 {
	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.makeNamesAndArrayInit();
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.print();

	}
}
