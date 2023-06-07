package day6.nestedloop;

public class MultiplicationTableEx {

	public static void main(String[] args) {
		//구구단 2단부터 9단까지 출력하는 코드를 작성하세요.
		int i;
		int j = 1;
		for(i = 2;  i <= 9; i++ ) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
		System.out.println(i + ":" + j);
	}

}
