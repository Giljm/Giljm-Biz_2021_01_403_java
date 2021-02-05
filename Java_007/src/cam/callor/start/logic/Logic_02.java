package cam.callor.start.logic;

public class Logic_02 {

	public static void main(String args[]) {
		
		// 불값, 논리 연산 결과를 담는 변수
		boolean bYes = 3 == 3;
		bYes = 3 > 3;
		System.out.println(bYes);
		
		bYes = 3 >= 3;
		
		int num1 = 55;
		int num2 = 65;
		
		bYes = num1 >= num2;
		
		bYes = num1*2 >= num2;
		bYes = (num1 * 2) >= num2;
	
	}
	
}
