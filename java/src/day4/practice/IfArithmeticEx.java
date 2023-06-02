package day4.practice;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		//산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수와 연산자를 입력하세요. ");
		int num1, num2;
		char op;
		num1 = sc.nextInt();
		op = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		if(op == '+') {
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2));
		}else if (op == '-') {
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2));
		}else if (op == '*') {
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 * num2));
		}else if (op == '/') {
			System.out.println(num1 + " " + op + " " + num2 + " = " + ((double)num1 / num2));
		}else if (op == '%') {
			System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 % num2));
		}else {
			System.out.println("산술연산자가 아닙니다.");
		}
		sc.close();
	}

}
