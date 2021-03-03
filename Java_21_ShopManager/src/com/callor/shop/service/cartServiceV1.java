package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.inter.cartService;

public class cartServiceV1 implements cartService {

	private static final String String = null;
	private List<CartVO> menuList;
	private Scanner scan;
	private CartVO cartVO;

	public cartServiceV1() {

		menuList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);

	}

	@Override
	// 1. 장바구니 상품 담기
	public void inputCartList() {
		String strUserName;
		String strProductName;
		String strDate;
		String strTime;
		int intQty = 0;
		int intPrice = 0;

		// while문 이 끝나면 안에 담긴 값이
		// 소멸되기때문에 밖에다 빼놓음

		while (true) {
			System.out.println("\n상품정보 입력");
			System.out.println("==============");

			System.out.println("손님이름 >> ");
			strUserName = scan.nextLine();

			System.out.println("상품이름 >> ");
			strProductName = scan.nextLine();

//		System.out.println("추가 날짜");
//		strDate = scan.nextLine();

//		System.out.println("추가 시각");
//		strTime = scan.nextLine();

			while (true) {

				try {
					System.out.println("수량");
					String strQty = scan.nextLine();
					intQty = Integer.valueOf(strQty);
					if (intQty < 1) {
						System.out.println("수량은 1개 이상 입력하세요.");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("숫자로만 입력 가능합니다.");
					continue;
				}

			}

			while (true) {
				try {
					System.out.println("단가");
					String strPrice = scan.nextLine();
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 100) {
						System.out.println("단가는 100원 이상 입력 가능합니다.");
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("숫자로만 입력 가능합니다.");
					continue;
				}
			}

			cartVO = new CartVO();
			cartVO.setUserName(strUserName);
			cartVO.setProductName(strProductName);
//			cartVO.setDate(strDate);
//			cartVO.setTime(strTime);
			cartVO.setQty(intQty);
			cartVO.setPrice(intPrice);
			cartVO.setTotal(intPrice * intQty);

			menuList.add(cartVO);
			break;
		}
	}

	@Override
	// 2. 장바구니 전체 리스트 보기
	public void printCartListAll() {

		System.out.println("\n구매자\t상품명\t단가\t수량\t합계");
		System.out.println("====================================");

		int nSize = menuList.size();
		int sum = 0;
		int i = 0;
		for (i = 0; i < nSize; i++) {

			System.out.print(menuList.get(i).getUserName() + "\t");
			System.out.print(menuList.get(i).getProductName() + "\t");
			System.out.print(menuList.get(i).getQty() + "\t");
			System.out.print(menuList.get(i).getPrice() + "\t");
			System.out.println(menuList.get(i).getTotal() + "\t");
			sum += menuList.get(i).getTotal();

		}
		System.out.println("-----------------------------------");
		System.out.println("합계\t" + i + "가지\t\t\t" + sum);
		System.out.println("\n");
	}

	@Override
	// 3. 구매자별 장바구니 리스트 보기
	public void printCartSelectList() {

		System.out.println("===============================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("-------------------------------");

		System.out.print("이름 >> ");
		String name = scan.nextLine();

		System.out.println("*" + name + "장바구니리스트");
		System.out.println("====================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계\n");
		System.out.println("------------------------------------");

		int nSize = menuList.size();
		int sum = 0;
		int i = 0;
		for (i = 0; i < nSize; i++) {

			if (menuList.get(i).getUserName().equals(name)) {

				System.out.print(menuList.get(i).getUserName() + "\t");
				System.out.print(menuList.get(i).getProductName() + "\t");
				System.out.print(menuList.get(i).getQty() + "\t");
				System.out.print(menuList.get(i).getPrice() + "\t");
				System.out.println(menuList.get(i).getTotal() + "\t");
				sum += menuList.get(i).getTotal();
			}

			System.out.println("-----------------------------------");
			System.out.println("합계\t" + i + "가지\t\t" + sum);
			System.out.println("\n");

		}
		System.out.println("\n");
	}

}