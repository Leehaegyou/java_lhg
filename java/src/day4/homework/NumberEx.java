package day4.homework;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		//정수 num가 짝수이면 num에 2를 나누고, 정수 num가 홀수이면 num에 1을 더한 후, num를 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num;
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num / 2);
		}else {
			System.out.println(num + 1);
		}
		
		sc.close();
	}

}
