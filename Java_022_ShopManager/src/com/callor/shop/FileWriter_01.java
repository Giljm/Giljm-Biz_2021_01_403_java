package com.callor.shop;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	public static void main(String[] args) {

		String strnums = "src/com/callor/shop/nums.txt";
		// 파일이름을 경로포함해서 결정.
		
		Random rnd = new Random();
		// Random 클래스를 사용하여 객체 선언 및 생성
		
		int[] intnum = new int[100];
		// 1000개의 배열생성
		for (int i = 0; i < intnum.length; i++) {
			intnum[i] = rnd.nextInt(1000) + 1; // 랜덤수를 담는다
		}

		
		FileWriter fileWriter = null;
		// FileWriter라는 클래스를 사용하여 fileWriter라는 객체 선언

		PrintWriter printer = null;
		// PrintWriter라는 클래스를 사용하여 printer라는 객체 선언
		
		
		try {
			fileWriter = new FileWriter(strnums);
			// 여기까지 코드가 정상 수행되면
			// fileWriter는 System.in 처럼 파일과
			// java 코드간에 연결하는 통로를 형성한다.

			printer = new PrintWriter(fileWriter);
			
			for (int i = 0; i < intnum.length; i++) {
				printer.println(intnum);
			}

			printer.close();
			fileWriter.close();
			System.out.println("저장 완료!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
