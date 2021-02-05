package cam.callor.start.pay;

/*
 *  이 코드는 for() 반복문의 코드 실행순서를
 *  참조하는 용도이며 pay 계산에는 오류가 있다.
 */

public class pay_04 {

	public static void main(String[] args) {
		
		// 5만원권 계산
				
				int paper = 50_000;
				int count = 0;
				int sw = -1;
				
				for ( int pay = 4_789_800 ; pay > 0 ; pay -= (paper * count) ) {
					
					count = pay / paper;
					
					System.out.println(paper + "원권 : " + count);
					
					if(sw < 0) { // sw가 0보다 작으면
						paper = paper / 5;
					
					}
					if (sw > 0) { // 그렇지 않으면
						paper = paper / 2;
					}
					
					// 최초에는 sw가 -1 이다가
					// 두번째 for() 반복문을 시작하기전에 
					// -1을 곱하여 sw를 1로 만든다
					sw *= (-1);
					
			}
					
		}
	
	}
	