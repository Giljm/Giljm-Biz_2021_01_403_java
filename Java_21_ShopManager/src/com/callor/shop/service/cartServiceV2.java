package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.inter.cartService;

public class cartServiceV2 implements cartService {

	private List<CartVO> cartList;
	// 리스트 배열 선언
	private Scanner scan;
	// 스캔 선언

	public cartServiceV2() {

		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
		// cartList와 scan 초기화
		// 메모리 관리 하려고 초기화

	} // end cartServiceV1

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
				// if문에서 정수와 비교하기 위해 타입변환

				if (intQty < 1) {
					System.out.println("수량은 1개 이상 입력하세요.");
					// if문을 거치면 break; 가 없기에 다시 while 반복
				} else {
					break; // 1개 이상일 경우 while을 멈춤
				}
			} catch (Exception e) {
				System.out.println("숫자로만 입력 가능합니다.");
				continue; // 정수 외에 값을 입력하면 다시 while로 돌아감
			}

		} // end while

		while (true) {
			try {
				System.out.println("단가");
				String strPrice = scan.nextLine();
				intPrice = Integer.valueOf(strPrice);
				// if문에서 정수와 비교하기 위해 타입변환

				if (intPrice < 100) {
					System.out.println("단가는 100원 이상 입력 가능합니다.");
				} else {
					break; // 100원 이상일 경우 while을 멈춤
				}
			} catch (Exception e) {
				System.out.println("숫자로만 입력 가능합니다.");
				continue; // 정수 외에 값을 입력하면 다시 while로 돌아감
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

	} // end inputCartList

	@Override
	// 2. 장바구니 전체 리스트 보기
	public void printCartListAll() {

		System.out.println("\n* 전체 장바구니 리스트");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
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
		// 여기에서는 전체를 출력하기 때문에 nSize를 사용
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
		int sum = 0;
		int i = 0; // for을 밖으로 빼줘야 사용가능

		System.out.println("\n* " + name + " 장바구니리스트");
		System.out.println("====================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------");

		for (i = 0; i < nSize; i++) {
			// cartList의 get i 번째 getUserName()과 equals를 통해 입력한 name과 비교
			if (cartList.get(i).getUserName().equals(name)) {

				System.out.print(cartList.get(i).getUserName() + "\t");
				System.out.print(cartList.get(i).getProductName() + "\t");
				System.out.print(cartList.get(i).getQty() + "\t");
				System.out.print(cartList.get(i).getPrice() + "\t");
				System.out.println(cartList.get(i).getTotal() + "\t");
				sum += cartList.get(i).getTotal();
				// nSize 리스트의 수만큼 저장된 cartList에서 해당되는 이름을 찾음

			} else { // 비교문이 다르면 아래 처럼 출력
				System.out.println("비어 있음");
				System.out.println("-----------------------------------\n");
				break;
				// 해당되는 이름이 없으면 여기서 반복문 종료
			}

		} // end for

		System.out.println("-----------------------------------");
		System.out.println("합계\t" + i + "가지\t\t\t" + sum + "\n");
		// 여기에서는 해당되지 않는 이름은 0개로 출력되어야 하기에 i를 사용

	} // end printCartSelectList method()

}
