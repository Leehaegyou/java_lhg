package day3.opeartor;

public class ConditionalEx {

	public static void main(String[] args) {
		//나이가 20세 이상이면 성인, 아니면 미성년자 를 출력하는 코드를 작성하세요.
		int age = 20;
		String str;
		
		str = age >= 20 ? "성인" : "미성년자";
		System.out.println(age + "세 : " + str);
	}

}
