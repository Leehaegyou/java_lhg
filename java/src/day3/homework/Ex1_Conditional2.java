package day3.homework;

import java.util.Scanner;

public class Ex1_Conditional2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요.");
		String gender;
		gender = sc.next();
		boolean result = gender.equals("W") ? true : false;
		System.out.println("여성이 맞습니까? " + result);
		sc.close();
		
	}

}
