package com.callor.oop.service.impl;

import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.MenuService;

public class MenuServiceImplV2 implements MenuService {

	/*
	 * 인스턴스 객체변수 선언 생성자에서 객체변수 초기화하여 사용할 준비
	 */

	private Scanner scan;

	public MenuServiceImplV2() {

		scan = new Scanner(System.in);

	}

	public void selectMenu() {

		while (true) {

			System.out.println("====================");
			System.out.println("카트 메뉴 System v1");
			System.out.println("--------------------");

			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("--------------------");

			System.out.println("선택 >> ");
			String strMenu = scan.nextLine();

			// 1. Q를 입력하면 끝내기

			if (strMenu.equals("Q")) {
				System.out.println("끝내기");
				return;
			}

			// 2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				int intNum = Integer.valueOf(strMenu);

				if (intNum == 1) {
					System.out.println("1. 카트추가");

				} else if (intNum == 2) {
					System.out.println("2. 카트삭제");

				} else if (intNum == 3) {
					System.out.println("3. 카트 리스트");

				} else {
					System.out.println("메뉴는 1 ~ 3 까지만 출력");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("1, 2, 3, Q만 입력가능");
			}

		}
	}
}
