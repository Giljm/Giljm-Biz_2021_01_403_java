package com.callor.cart.Service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.cart.Service.CartService;
import com.callor.cart.model.CartVO;

public class CartServiceV1 implements CartService {

	private List<CartVO> cartList;
	private Scanner scan;

	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {

		System.out.println("=========================");
		System.out.println("장바구니에 넣기");
		System.out.println("-------------------------");

		System.out.print("구매자 >> ");
		String strUserName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			intQty = Integer.valueOf(strQty);

			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1이상");
					continue;
				}

			} catch (Exception e) {
				System.out.println("수량은 숫자로만!!!");
			}

			CartVO cartVO = new CartVO();
			cartVO.setUserName(strUserName);
			cartVO.setQty(intQty);

			cartList.add(cartVO);

		}

	}

	@Override
	public void printCart() {

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(cartList.get(i));
		}

	}

}
