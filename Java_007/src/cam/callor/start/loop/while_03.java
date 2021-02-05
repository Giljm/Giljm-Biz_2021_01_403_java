package cam.callor.start.loop;

public class while_03 {

	public static void main(String[] args) {
		
		int index = 0;
		while(true) {
			// 이 코드는 매우 불편한 코드
			if(index % 3 > 0) {
				System.out.println("3의 배수가 아님");
			}
			if(index++ % 3 == 0) {
				System.out.println(index + "는 3의 배수");
			} else { 
				System.out.println(index + "는 3의 배수 아님");
			}
			
			
			if(index > 1000) {
				break;
			}
		}
	}
	
}
