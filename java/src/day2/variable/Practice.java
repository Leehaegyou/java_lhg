package day2.variable;

public class Practice {

	public static void main(String[] args) {
		/* 1. 아래 코드에서 잘못된 부분을 찾아 수정하세요.
		 * char ch1 "A";
		 * */
		//문자는 ''로 감싸여야 한다. ""가 아님
		char ch1 = 'A';
		/* 2. 국어, 영어, 수학 성적을 입력하여 평균을 구하려 한다. 이 때 필요한 변수들을 선언하세요.
		 * */
		//평균은 소수점이 있을 수 있어서 double 사용
		int eng, kor, mat, sum;
		eng = 80;
		kor = 70;
		mat = 60;
		sum = eng+kor+mat;
		double avg = sum/3;
		
		System.out.println(avg);
	}

}
