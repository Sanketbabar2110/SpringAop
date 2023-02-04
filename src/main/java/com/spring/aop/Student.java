package com.spring.aop;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	private int marks;

	public String result(int marks) {

		if (marks >= 40) {
			System.out.println("Student is : " + "pass");
			return "pass";
		} else {
			System.out.println("Student is : " + "fail");
			throw new ArithmeticException("fail");
		}
	}
}
