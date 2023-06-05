package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//max = num1, max = num2
		if(num1 > num2) {
			System.out.println("두 정수중 큰 수는 : " + num1 + " 입니다.");	
		}else {
			System.out.println("두 정수중 큰 수는 : " + num2 + " 입니다.");
		}
		sc.close();
	}

}
