package day21.practice.updown.run;

import java.util.Random;
import java.util.Scanner;

import day21.practice.updown.controller.GameManager;

public class UpDownEx {

	public static void main(String[] args) {
		GameManager gm = new GameManager();
		gm.run();
		
	}
	
}

/*Scanner sc = new Scanner(System.in);
		int num = 0, menu = 0, count  = 0;
		int r;
		int min = 1, max = 100;
		r = (int)(Math.random() * (max - min + 1) + min);
		
		while(menu != 3) {	
			System.out.println("Menu");
			System.out.println("1.play");
			System.out.println("2.record");
			System.out.println("3.Exit");
			System.out.print("Select Menu : ");
			menu = sc.nextInt();
		
		}
		switch(menu) {
		case 1:
			System.out.println("Random Number : " + r);
			System.out.print("number : ");
			num = sc.nextInt();
			while(num != r) {
				if(num < r) {
					System.out.println("Up");
				}else if(num > r) {
					System.out.println("Down");
				}else if(num == r) {
					System.out.println("O");
				}
				break;
			}
			break;
		case 2:
			System.out.println("number of iterations : " + count);
			break;
		case 3:
			System.out.println("Exit");
			break;
		default:
		}
		sc.close();*/