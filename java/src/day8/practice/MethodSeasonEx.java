package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		//월을 입력받아 계절을 출력하는 코드를 작성하세요.
		//단, 메서드를 이용할 것.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		num = sc.nextInt();
		System.out.println(getSeason(num));
		sc.close();
		}
	/**월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 * 매개변수 : 월 => int num
	 * 리턴타입 : 계절 => String
	 * 메서드명 : getSeason
	 */
	public static String getSeason(int num) {
		if(num == 3 || num == 4 || num == 5) {
			return("봄");
		}else if(num == 5 || num == 6 || num == 7) {
			return("여름");
		}else if(num == 8 || num == 9 || num == 10) {
			return("가을");
		}else if(num == 11 || num == 1 || num == 2) {
			return("겨울");
		}else {
			return("잘못된 월 입니다.");
		}		
	}
}