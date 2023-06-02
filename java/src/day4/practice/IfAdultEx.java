package day4.practice;

import java.util.Scanner;

public class IfAdultEx {

	public static void main(String[] args) {
		//나이를 입력받아 나이가 20세 이상이면 adult를 출력하고, 20세 미만이면 minor로 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age;
		age = sc.nextInt();
		if(age >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		sc.close();
	}

}
