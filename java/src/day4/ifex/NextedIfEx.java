package day4.ifex;

public class NextedIfEx {

	public static void main(String[] args) {
		/* 2,3,6의 배수 판별 예제 */
		int num = 3;
		
		//2의배수
		if (num % 2 == 0) {
			//3의 배수
			if(num % 3 == 0) {
				System.out.println("6의 배수");
			}
			//아닌수 2의배수
			else {
				System.out.println("2의 배수");
			}
		}
		//3의배수
		else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}
		//아닌 수
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
	}

}
