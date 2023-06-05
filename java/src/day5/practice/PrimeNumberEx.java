package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		//정수 num를 입력받아 num가 소수인지 아닌지를 판별하는 코드를 작성하세요.
		//소수 : 약수가 1과 자기자신 밖에 없는 수.
		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		num = sc.nextInt();
		i = 1;
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
			if(count == 2) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}
			sc.close();
		}
	}
