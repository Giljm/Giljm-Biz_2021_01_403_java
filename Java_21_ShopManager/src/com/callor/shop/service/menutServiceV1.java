package com.callor.shop.service;

import java.util.Scanner;

import com.callor.shop.service.inter.menuService;

public class menutServiceV1 implements menuService {

	private Scanner scan;

	public menutServiceV1() {

		scan = new Scanner(System.in);
		// 스캔 초기화
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
				// 입력해서 strMenu에 저장
					
				if (strMenu.equals("QUIT")) {
					// 입력해서 저장된 strMenu와 QUIT가 같냐
					System.out.println("종료");
					break;
					// 종료 메세지 출력하고 break;
				}
				
				int intMenu = Integer.valueOf(strMenu);

				// 1 ~ 3 값을 입력
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("\n업무 선택은 1 ~ 3 까지 중에 선택하세요\n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("\n업무 선택은 QUIT(끝내기), 1 ~ 3 까지 정수만 입력할 수 있습니다.\n");
			} // catch 문이 끝내도 while문 재실행

		} // end while
		
		// 1 ~ 3을 입력할 경우 통과해서 메인에 전달

		return null;

	}

}
