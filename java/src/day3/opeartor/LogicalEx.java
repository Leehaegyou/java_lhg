package day3.opeartor;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 85;
		//성적이(score) 80점 이상이고, 90점 미만인가?
		//score가 80보다 크거나 같고, 90보다 작다
		//score가 80보다 크거나 같다 && score가 90보다 작다
		//score >= 80 && score < 90 
		//AND
		System.out.println(score + "점은 B학점인가? " + (score >= 80 && score < 90));
		
		int age = 21;
		//OR
		//20세 이상이면 성인 
		boolean isAdult = age >= 20;
		//age살은 미성년자 인가?
		System.out.println(age + "세는 미성년자인가? " + (!isAdult));
		
		//NOT
		//주민등록증은 있고 운전면허증은 없다
		//둘중 하나만 있으면 볼수 있다.
		boolean hasIdCard = true;
		boolean hasDrieverCard = false;
		System.out.println("토익을 볼수 있을까? " + (hasIdCard || hasDrieverCard));
		
		
	}

}
