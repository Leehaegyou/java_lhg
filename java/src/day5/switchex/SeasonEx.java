package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		//월을 입력받아 입력받은 월의 계절을 출력하세요.
		// 345봄 678여름 91011가을 1212겨울 그외 잘못
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int num;
		num = sc.nextInt();
		switch(num) {
		case 3,4,5:
			System.out.println("봄");
		break;
		case 6,7,8:
			System.out.println("여름");
		break;
		case 9,10,11:
			System.out.println("가을");
		break;
		case 12,1,2:
			System.out.println("겨울");
		break;
		default:
			System.out.println("잘못된 월 입니다.");
		}
	}

}
