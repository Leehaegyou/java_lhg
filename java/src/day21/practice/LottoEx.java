package day21.practice;

import java.util.HashSet;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
		int bonus;
		HashSet<Integer> lotto = new HashSet<>();
		HashSet<Integer> user = new HashSet<>();
		int min = 1, max = 45;
		
		//로또 번호를 생성
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * (max - min + 1) + min));
		}
		
		//보너스 생성
		do {
			bonus = (int)(Math.random() * (max - min + 1) + min);
		}while(lotto.contains(bonus));
		System.out.println(lotto);
		System.out.println("bonus : " + bonus);
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("input 6 numbers : ");
		while(user.size() < 6) {
			user.add(sc.nextInt());
		}
		sc.close();
		
		//등수 체크
		//일치하는 개수 확인
		int count = 0;
		for(Integer tmp : user) {
			if(lotto.contains(tmp)) {
				count++;
			}
		}
		//개수를 이용하여 등수 체크
		switch(count) {
		case 6: System.out.println("Rank 1"); break;
		case 5:
			if(user.contains(bonus)) {
				System.out.println("Rank 2");
			}else {
				System.out.println("Rank 3");
			}
			break;
		case 4: System.out.println("Rank 4"); break;
		case 3: System.out.println("Rank 5"); break;
		default:System.out.println("fail");
			
		}
	}
}
/*int count = 0;
		int min =1, max = 45;
		
		HashSet<Integer> set = new HashSet<>();
		while(set.size() < 7) {
			int r = random(min, max);
			set.add(r);
		}
		System.out.println(set);
		
	}
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random() * (max - min + 1) + min);*/
