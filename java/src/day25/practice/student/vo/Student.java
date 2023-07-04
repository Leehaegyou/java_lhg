package day25.practice.student.vo;

import day25.practice.student.vo.Student;

public class Student {
	private String classnum, department, name;
	
	
	
	public Student(String classnum, String department, String name) {
		super();
		this.classnum = classnum;
		this.department = department;
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Student [classnum=" + classnum + ", department=" + department + ", name=" + name + "]";
	}



	public String getClassnum() {
		return classnum;
	}

	public void setClassnum(String classnum) {
		this.classnum = classnum;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
