package day3.practice;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//정수를 입력받아 num가 홀수인지 짝수인지 판별하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num;
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 == 1) {
			System.out.println("홀수");
		}
		sc.close();
		
	}

}
