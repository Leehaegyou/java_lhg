package day8.practice;
import java.util.Scanner;

public class MethodGCDEx {

	public static void main(String[] args) {
		//정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		//단, 메서드를 이용할 것.
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int gcd = gcd(num1, num2);
		
		System.out.println(num1 + " 과 " + num2 + " 의 최대 공약수는 : " + gcd );
		/*int gcd = 0, i = 1;
		
		while(i <= num1) {
		if(isGCD(num1, num2, i, gcd)) {
			gcd = i;
			}
			i++;
		}
		System.out.println(gcd);
		
		sc.close();
	}
	public static boolean isGCD(int num1, int num2, int i, int gcd) {
		return num1 % i == 0 && num2 % i == 0;*/
		sc.close();
		
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;	
	}
	public static int gcd(int num1, int num2) {
		for(int i = num1; i >=1; i--) {
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;	
		
	}
}
