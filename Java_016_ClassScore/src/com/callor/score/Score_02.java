package com.callor.score;

import java.util.Random;

import com.callor.score.ScoreServiceV1.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		Random rnd = new Random();

		String[] name = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		int[] intKor = new int[name.length];
		int[] intEng = new int[name.length];
		int[] intMath = new int[name.length];
		int[] intSum = new int[name.length];
		float[] floatAvg = new float[name.length];

		int index = 0;
		for (index = 0; index < name.length; index++) {
			intKor[index] = rnd.nextInt(100) + 1;
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;
		}
		for (index = 0; index < name.length; index++) {
			// ssV1.scoreSum() 호출하여 총점
			// 총점을 계산하려면 3과목의 점수를 전달하고
			// 총점 결과를 다시 return 받아서 ... 해야한다

			// i 번째 학생의 3과목 점수를
			// scoreSum() 전달하고 결과를 다시 i 번째 학생의 총점에 저장
			// intSum[index] : index 번째 학생의 총점
			int sum = ssV1.scoreSum(intKor[index], intEng[index], intMath[index]);
			intSum[index] = sum;
		}

		for (index = 0; index < name.length; index++) {
			float avg = ssV1.scoreAvg(intSum[index]);
			floatAvg[index] = avg;
		}

		System.out.println("이름\t국어\t영어\t수학\t총합\t평균");
		System.out.println("==============================================");
		for (index = 0; index < name.length; index++) {
			ssV1.scorePrint(name[index], intKor[index], intEng[index], intMath[index], intSum[index], floatAvg[index]);

		}

		// 이름,국어,영어,수학,총점,평균 배열을
		// 통째로 매개변수로 전달하고
		// ssV1.print() method에서 리스트를 출력하도록
		ssV1.print(name, intKor, intEng, intMath, intSum, floatAvg);

	}

}
