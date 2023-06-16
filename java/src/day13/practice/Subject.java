package day13.practice;

import lombok.Data;

@Data

public class Subject {
	//성적을 관리하기 위한 Subject 클래스를 만드세요.
	private String title;
	private double total;
	private double midTerm;
	private double finalTerm;
	private double performance;
	private int grade;
	private int semester;
	
	
	public Subject(String title){
		this.title = title;
	}
	public Subject(String title, int grade, int semester) {
		this.title = title;
		this.grade = 1;
		this.semester = 1;
	}
	public void updateScore(int midTerm, int finalTerm, int performance) {
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		this.performance = performance;
		total = midTerm + finalTerm + performance;
		
	}
	public void print() {
		System.out.println("title    : " + title);
		System.out.println("grade    : " + grade);
		System.out.println("semester : " + semester);
		System.out.println("mid      : " + midTerm);
		System.out.println("final    : " + finalTerm);
		System.out.println("perform  : " + performance);
		System.out.println("total    : " + total);
	}
}
