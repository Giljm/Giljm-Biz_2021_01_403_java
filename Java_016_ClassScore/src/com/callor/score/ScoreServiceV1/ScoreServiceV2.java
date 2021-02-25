package com.callor.score.ScoreServiceV1;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {

	public int scoreSum(int kor, int eng, int math, int music) {
		int sum = kor;
		sum += eng;
		sum += math;
		sum += music;
		
		return sum;
	}

	public int scoreSum(ScoreVO scoreVO) {
		
		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.inthistory;
		return sum;
	}
}
