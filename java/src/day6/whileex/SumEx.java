package day6.whileex;

public class SumEx {

	public static void main(String[] args) {
		//1부터 n까지 합을 구하는 코드를 작성하세요.
		//반복횟수 : n까지
		//규칙성 : 1+n
		//반복문 종료 후 : 더한 값 = sum
		
		int n = 10, sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 : " + sum);
	}

}
