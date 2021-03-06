package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.values;

public class MenuServiceV1 implements MenuService {

	@Override
	public Integer selectMenu() {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(values.sLine);
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(values.dLine);
			
			System.out.print("명령어 입력 >>");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				break;
			}

			Integer intMenu = null;

			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("선택한 값만 입력");
				continue;
			}

			if (intMenu >= 1 && intMenu <= 3) {
				return intMenu;
			} else {
				System.out.println("선택한 값만 입력");
			}

		}

		return null;

	}

}
