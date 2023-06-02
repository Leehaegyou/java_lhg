package day3.homework;

import java.util.Scanner;

public class Ex1_Conditional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요.");
		char gender;
		gender = sc.next().charAt(0);
		boolean result = gender == 'W' ? true : false;
		System.out.println("여성이 맞습니까? " + result);
		sc.close();
		
	}

}
