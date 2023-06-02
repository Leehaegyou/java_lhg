package day3.homework;

import java.util.Scanner;

public class Ex2_If {

	public static void main(String[] args) {
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요.");
		gender = sc.next().charAt(0);
		if(gender == 'M') {
			System.out.println("남성이 맞습니까?" + " man ");
		}
		if(gender == 'W') {
			System.out.println("여성이 맞습니까?" + " women ");
		}
			
		
		sc.close();
	}

}
