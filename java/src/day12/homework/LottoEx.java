package day12.homework;

import java.util.Scanner;

import array.Array;
public class LottoEx {

	public static void main(String[] args) {
		//로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를 작성하세요.
		//랜덤으로 로또번호 6개와 보너스번호 1개를 생성합니다.
		//7개짜리 배열에 로또번호를 생성하고, 앞에 6개는 로또번호, 마지막 1개는 보너스번호
		int lotto[] = new int[7];
		
		Array.createRandomArray(1,45,lotto);
		int bonus = lotto[6];
		int lotto2[] = new int[6];
		System.arraycopy(lotto, 0, lotto2, 0, 6);
		Array.sort(lotto2);
		System.out.println("number : ");
		Array.printArray(lotto2);
		
		System.out.println("bonus : " + bonus);
		
		//사용자가 번호 6개를 입력
		Scanner sc = new Scanner(System.in);
		int user[] = new int[6];
		
		System.out.println("user : ");
		for(int i = 0; i<user.length; i++) {
			user[i] = sc.nextInt();
		}
		//중복입력하면 판별x
		if(Array.arrayCheck(user)) {
			System.out.println("Wrong Number");
			return;
		}
		
		//등수 판별
		int count = count(lotto2, user);
		printResult(count, Array.contains(user, bonus, user.length));
		sc.close();
		
		/**로또 번호와 사용자 번호가 주어지면 몇개가 같은지 알려주는 메서드
		 * 매개변수 : 로또번호와 사용자 번호 => int lotto[], int user[]
		 * 리턴타입 :	몇개 같은지 => 정수 => int
		 * 메서드명 : count
		 */
	}
	public static int count(int lotto[], int user[]) {
		if(lotto = null || user == null) {
			return 0;
		}
		int count = 0;
		for(int tmp : lotto) {
			if(Array.contains(user, tmp, user.length)) {
				count++;
			}
		}
		return count;
	}
	/**일치하는 개수와 보너스번호와 사용자 번호가 일치하는지 여부를 알려주면 등수를 출력하는 메서드
	 * 매개변수 : 일치하는 개수, 보너스 번호와 일치 여부
	 * 			=> int count, boolean checkBonus
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printResult
	 */
	public static void printResult(int count, boolean checkBonus) {
		switch(count) {
		case 6:
			System.out.println("1");
			break;
		case 5:
			if(checkBonus) {
				System.out.println("2");				
			}else {
				System.out.println("3");				
			}
			break;
		case 4:
			System.out.println("4");
			break;
		case 3:
			System.out.println("5");
			break;
		default:
			System.out.println("6");
		}
	}
}

