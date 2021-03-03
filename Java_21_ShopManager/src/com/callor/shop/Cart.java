package com.callor.shop;

import com.callor.shop.service.cartServiceV1;
import com.callor.shop.service.menutServiceV1;
import com.callor.shop.service.inter.cartService;
import com.callor.shop.service.inter.menuService;

public class Cart {

	public static void main(String[] args) {

		cartService mService = new cartServiceV1();
		menuService sService = new menutServiceV1();

		while (true) {
			Integer select = sService.selectService();
			// 메뉴 선택 함수를 select에 담음
			// Integer로 해야 null이랑 정수를 담을 수 있음

			if (select == null) {
				break;
				// selecetService() method에서 null이 오면 멈추게 함
			}

			if (select == 1) {
				mService.inputCartList();
				continue; // continue를 통해 다시 while로 돌아가서 다음에 뭐 할지 물어봄

			} else if (select == 2) {
				mService.printCartListAll();
				continue;

			} else if (select == 3) {
				mService.printCartSelectList();
				continue;
			}

		} // end while

	} // end main
}