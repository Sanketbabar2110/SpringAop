package com.spring.aop;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	private int marks;
	
	public String result(int marks) {
	
		if(marks>=40)
			return "pass";
		else
			throw new ArithmeticException();
	}
}
