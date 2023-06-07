package day6.practice;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		//두 정수 num1과 num2를 입력받아 두 정수의 최대공약수를 구하는 코드를 작성하세요.
		//약수 : 나누어 떨어지는 수 //공약수 : 공통으로 있는 약수 // 최대공약수 : 공약수 중 가장 큰 수
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int gcd = 0;
		int num1, num2, i = 1;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		while(i <= num1) {
		if(num1 % i == 0 && num2 % i == 0) {
			gcd = i;
			}
			i++;
		}
		System.out.println(gcd);
		sc.close();
	}

}
