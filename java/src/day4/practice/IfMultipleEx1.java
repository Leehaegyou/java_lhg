package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		//정수 num를 입력받아 num가 2의 배수인지 아닌지를 판별하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num;
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("2의 배수 입니다.");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
		sc.close();
	}

}
