package day4.ifex;

import java.util.Scanner;

public class EvenNumberEx2 {

	public static void main(String[] args) {
		//홀짝 판별 예제를 조건 연산자를 이용하여 작성
		int num = 4;
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " : " + result + " 입니다.");
		}
	}
