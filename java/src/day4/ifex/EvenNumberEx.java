package day4.ifex;

import java.util.Scanner;

public class EvenNumberEx {

	public static void main(String[] args) {
		//if else문을 이용한 홀짝 판별 예제
		//num가 짝수면 짝수 홀수면 홀수라고 출력
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
