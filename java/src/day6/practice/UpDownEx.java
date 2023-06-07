package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		//UpDown 게임을 하는 코드를 작성하세요.
		//한판이 끝나면 더할건지 물어서 N은 종료 Y는이어서 게임을 진행
		
		char menu; 
		int i;
		int min = 1, max = 100;
		int random = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(random);
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			
				do {
					System.out.println("정수를 입력하세요.");
					num = sc.nextInt();
					if (num < random) {
						System.out.println("업!");
					}else if(num > random){
						System.out.println("다운!");			
					}else {
						System.out.println("정답!");						
					}
				}while(random != num);
				
				System.out.println("continue?(Y/N)");
				menu = sc.next().charAt(0);
		}while(menu != 'N');
				System.out.println("Exit");
			
			
		sc.close();
		
		
	}
}