package com.callor.shop.service;

import java.util.Scanner;

import com.callor.shop.service.inter.selectService;

public class selectServiceV1 implements selectService {

	private Scanner scan;

	public selectServiceV1() {

		scan = new Scanner(System.in);

	}

	@Override
	public Integer selectService() {

		while (true) {
			System.out.println("======================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("--------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("======================================");

			try {
				System.out.print("명령어 입력 >> ");
				String strMenu = scan.nextLine();

				if (strMenu.equals("QUIT")) {
					System.out.println("종료");
					break;
					// 종료 메세지 출력
				}
				Integer intMenu = Integer.valueOf(strMenu);

				// 1 ~ 3 값을 입력
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("\n업무 선택은 1 ~ 3 까지 중에 선택하세요\n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("업무 선택은 QUIT(끝내기), 1 ~ 3 까지 정수만 입력할 수 있습니다.");
			}

		}
		// 1 ~ 3 을 가져올 경우
		
		return null;

	}

}
