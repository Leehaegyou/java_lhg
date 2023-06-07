package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		//국어 영어 수학 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		
		Scanner sc = new Scanner (System.in);
		int kor, eng, mat;
		char menu = 'Y';		
		double avg;
		while(menu != 'N') {
			System.out.println("국어, 영어, 수학의 점수를 입력하세요.");
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
			avg = (kor + eng + mat) / 3;
			System.out.println(avg);
			System.out.println("countinu?");
			menu = sc.next().charAt(0);
		}
		System.out.println("EXIT!");
		sc.close();
	}

}
