package day6.practice;

import java.util.Scanner;

public class SumeEx2 {

	public static void main(String[] args) {
		//n을 입력받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		int n;
		n = sc.nextInt();
		
		while(i <= n) {
			
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
