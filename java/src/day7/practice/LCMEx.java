package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성하세요.
		//공배수 : 공통으로 있는 배수
		//최소 공배수 : 공배수 중 가장 작은 배수
		//최대 공배수 : 공배수 중 가장 큰 배수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int lcd = 0;
		int num1, num2, i = 1;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(i <= num1*num2) {
		if(i % num1 == 0 && i % num2 == 0) {
			lcd = i;
			break;
			}
			i++;
		}
		System.out.println(lcd);
		sc.close();
	}

}
