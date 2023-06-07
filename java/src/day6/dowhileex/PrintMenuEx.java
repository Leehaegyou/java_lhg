package day6.dowhileex;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		//다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로 실행되는 코드를 작성하세요.
		//1. Start 2. Saver 3. Exit // Select Menu :
		
		int menu;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("menu");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.println("Select Menu : ");
			menu = sc.nextInt();
			
		}while(menu != 3);
		switch(menu) {
			case 1:
				System.out.println("Program Start!");
				break;
			case 2:
				System.out.println("Program Save!");
				break;
			case 3:
				System.out.println("Program Exit!");
			default:
		}
		sc.close();
	}
}