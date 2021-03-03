package com.callor.shop;

import com.callor.shop.service.cartServiceV1;
import com.callor.shop.service.menutServiceV1;
import com.callor.shop.service.inter.cartService;
import com.callor.shop.service.inter.menuService;

public class Cart {

	public static void main(String[] args) {

		// 카트에 담을 상품 입력
		// 카트에 담은 상품 출력
		cartService mService = new cartServiceV1();

		// 메뉴 선택
		menuService sService = new menutServiceV1();

		// 메뉴 선택의 selectService 함수를 Integer type의 select에 담는다.

		while (true) {
			Integer select = sService.selectService();

			if (select == null) {
				break;
			}

			if (select == 1) {
				mService.inputCartList();
				continue;

			} else if (select == 2) {
				mService.printCartListAll();
				continue;

			} else if (select == 3) {
				mService.printCartSelectList();
				continue;
			}
		}
	}
}