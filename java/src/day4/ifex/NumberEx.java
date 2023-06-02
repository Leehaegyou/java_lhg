package day4.ifex;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		/* 정수 num가 양수이면 positive number라고 출력하고
		 * num가 음수이면 nagative number라고 출력하고
		 * num가 0이면 0으로 출력하는 코드를 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. ");
		int num;
		num = sc.nextInt();
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println(0);
		}
	}

}
