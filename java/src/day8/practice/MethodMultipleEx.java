package day8.practice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		//정수 num를 입력받아 2,3,6의 배수인지 아닌지를 판별하는 코드를 작성하세요.
		//단, 메서드를 이용할 것.
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		num1 = sc.nextInt();
		
		if(isMultiple(num1, 6)) {
			System.out.println(num1 + " : 6의 배수입니다.");
		}else if(isMultiple(num1, 2)) {
			System.out.println(num1 + " : 2의 배수입니다.");
		}else if(isMultiple(num1, 3)) {
			System.out.println(num1 + " : 3의 배수입니다.");
		}else {
			System.out.println(num1 + " : 2,3,6의 배수가 아닙니다.");
		}
		
		sc.close();
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
