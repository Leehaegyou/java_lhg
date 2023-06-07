package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		//UpDown게임
		//1부터 100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		int i = 1;
		int min = 1, max = 100;
		int random = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(random);
		Scanner sc = new Scanner(System.in);
		int num;
		while(random != i) {
			System.out.println("정수를 입력하세요.");
			num = sc.nextInt();
			if (num < random) {
				System.out.println("업!");
			}else if(num > random){
				System.out.println("다운!");			
			}else {
				System.out.println("정답!");						
			}

		}
		sc.close();
	}
}
