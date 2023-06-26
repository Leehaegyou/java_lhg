package day19.exception;

public class TryCatchEx {

	public static void main(String[] args) {
		//catch는 최소 1개는 필요.
		//어떤 예외가 발생할지 모를 때에는 Exception을 이용
		
		try {
			//예외가 발생할 수 있는 코드
			System.out.println(1 / -0);
		}catch(ArithmeticException e) {
			//예외처리
			System.out.println("예외처리를 합니다.");
		}catch(Exception e) {
			System.out.println("예외 처리를 합니다.");
		}
		System.out.println("프로그램 종료");
	}

}
