package day2.variable;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "";
		char op = '+';
		int num1 = 1, num2  = 2;
		//num1 + op 가 먼저 계산이 돼서 +에 해당하는 43과 1이 더해져서 44가 됨
		//44와 2가 더해져서 46
		//46과 문자열 = 이 더해져서 문자열 46=3
		str = num1 + op + num2 + "=" + (num1+num2);
		System.out.println(str);
		//빈문자열과 num1이 계산 돼서 문자열 1
		//문자열 1과 +가 더해져서 문자열 1+
		//문자열 1+와 2가 더해져서 문자열 1+2
		str = "" + num1 + op + num2 + "=" + (num1+num2);
		System.out.println(str);
		//문자열이 앞으로 오지 않으면 문자열로 인식이 안된다.
		//오버플로우 : 정수 변수가 표현할 수 있는 정수의 범위를 넘어서 의도했던 값과 다르게 나오는 현상으로 양수에서 음수로 될 때
		//언더플로우 : 정수 변수가 표현할 수 있는 정수의 범위를 넘어서 의도했던 값과 다르게 나오는 현상으로 음수에서 양수로 될 때
		//byte는 127, -128
	}

}
