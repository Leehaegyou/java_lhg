package day2.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("콘솔에서 정수 2개와 문자(산술연산자)를 입력받아 출력하는 코드를 작성하세요.");
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		1 + 2 = 3
		1 - 2 = -1
		1 * 2 = 2
		1 / 2 = 0.5
		1 % 2 = 1
		
		sc.close();
	}

}
