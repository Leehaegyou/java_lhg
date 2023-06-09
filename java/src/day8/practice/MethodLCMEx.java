package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		//단, 메서드를 이용할 것.
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int lcm = lcm1(num1, num2);
		System.out.println(num1 + " 과 " + num2 + " 의 최소 공배수는 : " + lcm);
		lcm = lcm2(num1, num2);
		System.out.println(num1 + " 과 " + num2 + " 의 최소 공배수는 : " + lcm);
		
		sc.close();
		
		}
		public static int lcm1(int num1, int num2) {
			for(int i = num1; i <= num1 * num2; i += num1) {
				if(isMultiple(i, num2)) {
					return i;
				}
			}
			return num1*num2;
		
		}
		public static int lcm2(int num1, int num2) {
			return num1 * num2 / lcm(num1, num2);
		}
		public static boolean isMultiple(int num1, int num2) {
			return num1 % num2 == 0;	
		}
		public static int lcm(int num1, int num2) {
			for(int i = 1; i <= num1*num2; i++) {
				if(isMultiple(num1, i) && isMultiple(num2, i)) {
					return i;
				}
			}
		return 1;
	}

}
