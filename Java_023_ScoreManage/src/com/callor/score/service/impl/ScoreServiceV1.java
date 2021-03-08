package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.values;

public class ScoreServiceV1 implements ScoreService {

	private List<String> scoreString; // 선언만
	private List<ScoreVO> scoreList;
	private String fileName; // 문자형 선언만

	public ScoreServiceV1() { // 생성자 메서드
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt"; // 파일 이름 및 저장위치
		// 생성 및 초기화
		// 여기에서 초기화는 메모리 누수를 막기 위해

	}

	@Override
	// Random 값들 생성하여 저장
	public void makeScore() {
		scoreList = new ArrayList<ScoreVO>();
		// 다시 값을 초기화

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) { // 20명의 학생이기에 20번 반복
			ScoreVO scoreVO = new ScoreVO(); // Score VO 선언 및 생성
			scoreVO.setKor(rnd.nextInt(100) + 1); // ScoreVO의 set에 랜덤수 저장
			scoreVO.setEng(rnd.nextInt(100) + 1);
			scoreVO.setMath(rnd.nextInt(100) + 1);
			scoreVO.setMusic(rnd.nextInt(100) + 1);
			scoreVO.setHistory(rnd.nextInt(100) + 1);

			scoreList.add(scoreVO); // scoreList에 scoreVO값을 담음

		} // end for

		System.out.println("\n값 생성 완료!\n");

	} // end makeScore

	@Override
	public void saveScoreToFile() {
		FileWriter fileWriter;
		PrintWriter printWriter;

		try {
			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);

			int nsize = scoreList.size();
			for (int i = 0; i < nsize; i++) {
				ScoreVO scoreVO = scoreList.get(i);
				printWriter.print(scoreVO.getKor() + ":");
				printWriter.print(scoreVO.getEng() + ":");
				printWriter.print(scoreVO.getMath() + ":");
				printWriter.print(scoreVO.getMusic() + ":");
				printWriter.print(scoreVO.getHistory() + ":\n");

			}

			printWriter.close();
			fileWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		scoreString = new ArrayList<String>();

		System.out.println("\n완료!\n");

	} // end saveScoreToFile

	@Override
	public void loadScoreFromFile() {
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();
		FileReader fileReader;
		BufferedReader buffer;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String str = buffer.readLine();
				if (str == null) {
					break;
				}
				scoreString.add(str);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String str : scoreString) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setMusic(Integer.valueOf(scores[3]));
			scoreVO.setHistory(Integer.valueOf(scores[4]));

			scoreList.add(scoreVO);
		}

		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;

			vo.setTotal(sum);
			vo.setAvg(avg);
		}

		System.out.println(values.dLine);
		System.out.println("순번\t\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(values.sLine);

		int count = 0;
		for (ScoreVO vo : scoreList) {
			System.out.print(++count + "\t\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}

		System.out.println(values.dLine);

		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();

	} // end loadScoreFromFile

}