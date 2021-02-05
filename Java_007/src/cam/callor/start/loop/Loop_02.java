package cam.callor.start.loop;

public class Loop_02 {

	public static void main(String args[]) {
		for(int i = 0 ; i < 10 ; i += 1) {
		}
		
		int num = 0;
		num = num + 1;
		num += 1;
		num =+1;;  // 이 코드는 사용하지 말것
		num++; // 넘버라는 변수를 1증가 시켜라
		++num; // 넘버라는 변수를 1증가 시켜라 단항연산자

		num = num - 1;
		num -= 1;
		num--; // 1감소 시켜라
		--num; 
		for(int i = 0 ; i < 10 ; i++);{ // i는 선언, i를 10과 비교, i++는 i를 계속 증가.
		}
		
		// i값이 100부터 시작하여 i < 0 까지
		// 1씩 감소하면서 반복한다.
		for(int i = 100 ; i > 0 ; i--) { //역순으로 하는 방법
			System.out.println(i);
		}
		
	}
	
}
