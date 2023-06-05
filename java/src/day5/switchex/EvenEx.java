package day5.switchex;

public class EvenEx {

	public static void main(String[] args) {
		//홀짝 예제를 switch문으로 
		int num = 5;
		
		switch(num % 2) {
		case 0:
			System.out.println(num + " is a enen number.");
			break;
		default:
			System.out.println(num + " is a odd number.");
		}
	}

}
