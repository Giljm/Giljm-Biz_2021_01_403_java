package com.callor.oop.service.impl;

import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class MenuServiceImplV1 {

	private Scanner scan;

	public void selectMenu() {

		scan = new Scanner(System.in);

		while (true) {
			System.out.println("====================");
			System.out.println("Java Menu System v1");
			System.out.println("--------------------");

			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("--------------------");

			try {
				System.out.println("선택 >> ");
				String strNum = scan.nextLine();

				int intNum = Integer.valueOf(strNum);

				if (intNum == 1) {
					System.out.println("카트추가");
				}

				if (intNum == 2) {
					System.out.println("카트삭제");
				}

				if (intNum == 3) {
					System.out.println("카트리스트");
				}

				if (strNum == "Q") {
					System.out.println("끝내기");
				}

				if (intNum >= 4) {
					System.out.println("1, 2, 3, Q만 입력!");

				}

			} catch (Exception e) {
				System.out.println("1, 2, 3, Q만 입력가능");
			}

		}

	}
}