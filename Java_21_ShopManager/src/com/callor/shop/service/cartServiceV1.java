package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.inter.cartService;

public class cartServiceV1 implements cartService {

	private List<CartVO> cartList;
	// 리스트 배열 선언
	private Scanner scan;
	// 스캔 선언

	public cartServiceV1() {

		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
		// cartList와 scan 초기화
		// 메모리 관리 하려고 초기화

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

		// 유효성 검사
		while (true) {
			try {
				System.out.println("수량");
				String strQty = scan.nextLine();
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1개 이상 입력하세요.");
					// if문을 거치면 break; 가 없기에 다시 while 반복
				} else {
					break;
					// 1이상만 입력 하면 if문을 거치고 else로 와서
					// break; 만나서 while문이 끝나게됨
				}
			} catch (Exception e) {
				System.out.println("숫자로만 입력 가능합니다.");
				continue; // 가까운 while로 찾아감
			}

		} // end while

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
		} // end while

		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
//		cartVO.setDate(strDate);
//		cartVO.setTime(strTime);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice * intQty);
		// cartVO set에 담음

		cartList.add(cartVO);
		// cartVO에 담은걸 cartList 담음

	}

	@Override
	// 2. 장바구니 전체 리스트 보기
	public void printCartListAll() {

		System.out.println("\n* 전체 장바구니 리스트");
		System.out.println("\n구매자\t상품명\t단가\t수량\t합계");
		System.out.println("====================================");

		int nSize = cartList.size();
		int sum = 0;
		// nSize와 sum을 for문 밖에다 빼놔야 쓸 수 있음

		for (int i = 0; i < nSize; i++) {

			System.out.print(cartList.get(i).getUserName() + "\t");
			System.out.print(cartList.get(i).getProductName() + "\t");
			System.out.print(cartList.get(i).getQty() + "\t");
			System.out.print(cartList.get(i).getPrice() + "\t");
			System.out.println(cartList.get(i).getTotal() + "\t");
			sum += cartList.get(i).getTotal();

		} // end for

		System.out.println("-----------------------------------");
		System.out.println("합계\t" + nSize + "가지\t\t\t" + sum);
		System.out.println("\n");

	} // end printCartListAll

	@Override
	// 3. 구매자별 장바구니 리스트 보기
	public void printCartSelectList() {

		System.out.println("\n===============================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("-------------------------------");

		System.out.print("이름 >> ");
		String name = scan.nextLine();
		// 입력한 값을 문자형 name에 담음

		int nSize = cartList.size();
		int sum = 0; // sum을 밖으로 빼줘야 입력가능

		System.out.println("\n* " + name + " 장바구니리스트");
		System.out.println("====================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------");

		for (int i = 0; i < nSize; i++) {
//			int sum = 0;
			// cartList의 get i 번째 getUserName()과 equals를 통해 입력한 name과 비교
			if (cartList.get(i).getUserName().equals(name)) {

				System.out.print(cartList.get(i).getUserName() + "\t");
				System.out.print(cartList.get(i).getProductName() + "\t");
				System.out.print(cartList.get(i).getQty() + "\t");
				System.out.print(cartList.get(i).getPrice() + "\t");
				System.out.println(cartList.get(i).getTotal() + "\t");
				sum += cartList.get(i).getTotal();
				
				System.out.println("-----------------------------------");
				System.out.println("합계\t" + nSize + "가지\t\t\t" + sum);
				System.out.println("\n");
				
				break;

			} else { // 비교문이 다르면
						// 아래 처럼 출력
				System.out.println("비어 있음");
				System.out.println("-----------------------------------\n");
			}

		} // end for

	}

} // end printCartSelectList method()
