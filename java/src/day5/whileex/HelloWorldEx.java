package day5.whileex;

public class HelloWorldEx {

	public static void main(String[] args) {
		//Hello World를 10번 출력하는 코드를 작성하세요.
		//반복횟수 : 10번, 1부터 10까지 1씩 증가.
		//변수의 초기값 : 1 | 조건식 : 10까지, 10보다 작거나 같을때 까지 | 증가하는식 : 1씩 증가  
		//규칙성 : Hello World 출력
		int max = 3;
		int i = 1; // 변수의 초기값
		while(i <= max) {
			System.out.println("Hello World");
			++i;
		}
		System.out.println("===========");
		//반복횟수 : 10부터 1까지 1씩 감소
		i = max;
		while(i >= 1) {
			System.out.println("Hello World");
			--i;
		}
	}

}
