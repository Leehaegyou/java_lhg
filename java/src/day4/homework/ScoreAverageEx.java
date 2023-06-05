package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		//국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.");
		int kor, eng, mat;
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		int sum = kor + eng + mat;
		double avg = sum / 3;
			System.out.println(avg);
		sc.close();
		}

	}
