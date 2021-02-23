package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int keyScan = scan.nextInt();
		// 키보드로 값을 입력해서 keyScan에 저장
		
		
		psV2.prime(keyScan);
		// 입력한 값을 psV2로 보내고, psV2 안의 prime method를 실행
		
		int result = psV2.prime(keyScan);
		// prime() method에서 실행된 결과를 result에 선언
		
		
		if(result < 0) { 
			System.out.println(keyScan + "는 소수가 아님");
			// keyScan의 값이 prime() method 에서 return된게 -1 이라면 당연히
			// 0보다는 작으므로 true가 되므로 출력문이 출력된다.
			
		} else {
			System.out.println(keyScan + "는 소수");
			// keyScan의 값이 prime() method 에서 return된게 소수라면 당연히
			// 0보다는 크므로 if문을 넘고, else가 실행되어 출력문을 출력한다.
		}
		
	}
}
