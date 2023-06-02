package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		//월을 입력받아 입력받은 월의 계절을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요. ");
		int num;
		num = sc.nextInt();
		
		if (num > 2 && num < 6) {
			System.out.println("봄");
		}else if(num > 5 && num < 9) {
			System.out.println("여름");
		}else if(num > 8 && num < 12  ) {
			System.out.println("가을");
		}else if(num > 0 && num <13) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못된 월");
		}
	}

}
