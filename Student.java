package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is");
	}
	public void studentDept() {
		System.out.println("Student Dept is");
	}
	public void studentId() {
		System.out.println("Student ID is");

	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();

		stu.deptName();

		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();

	}

}
