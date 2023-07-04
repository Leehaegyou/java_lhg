package day25.practice.student.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import day25.practice.student.vo.Student;

public class Controller2 implements Program{
	
	private final static int EXIT = 3;
	private Scanner sc = new Scanner(System.in);
	private List<Student> list = new ArrayList<Student>();
	
	@Override
	public void run() {
		System.out.println("Program start!");
		int menu;
		do {
			try {
				System.out.println();
				printMenu();
				menu = sc.nextInt();
				
				runMenu(menu);
			}catch(InputMismatchException e) {
				menu = EXIT-1;
				sc.nextLine();
				System.out.println("Wrong Input!");
			}
		}while(menu != EXIT);
			System.out.println("EXIT!");
	}

	@Override
	public void printMenu() {
		System.out.println("[Menu]");
		System.out.println("1. Insert Student");
		System.out.println("2. Check Student");
		System.out.println("3. EXIT");
		System.out.println("[Select Menu]");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			checkStudent();
			break;
		case 3:
			break;
		default:
		}
	}

	private void checkStudent() {
		System.out.println(list);
	}

	private void insertStudent() {
		System.out.print("ClassNum : ");
		sc.nextLine();
		String classnum = sc.nextLine();
		System.out.print("Department : ");
		String department = sc.nextLine();
		System.out.print("Name : ");
		String name = sc.nextLine();
		
		Student std = new Student(classnum, department, name);
		
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("Insert Success!");
			return;
		}
		System.out.println("Fail!");
		sc.close();
	}
	
	
}
