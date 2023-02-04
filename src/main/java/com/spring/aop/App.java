package com.spring.aop;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student std = ctx.getBean("student", Student.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks : ");
		int marks = sc.nextInt();
		
		std.result(marks);
	}
}

