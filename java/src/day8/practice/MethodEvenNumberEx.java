package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		//정수 num을 입력받아 짝수인지 아닌지 판별하는 코드를 작성하세요.
		//단, 메서드를 이용할 것.
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요");
	int num1;
	num1 = sc.nextInt();
	if(num1 % 2 == 0) {
		System.out.println("짝수입니다.");
	}else {
		System.out.println("홀수입니다.");
	}
	sc.close();
	}

}