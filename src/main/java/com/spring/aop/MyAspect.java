 package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* com.spring.aop.*.*(..))")
	public void beforeResult() {
		System.out.println("-------this will execute before result method-------");
	}

	@AfterThrowing("execution(* com.spring.aop.*.*(..))")
	public void afterThrowingResult() {
		System.out.println("-------this will execute after exception thrown by result method-------");
	}

	@AfterReturning("execution(* com.spring.aop.*.*(..))")
	public void afterReturningResult() {
		System.out.println("-------this will execute after returning result method-------");
	}

	@After("execution(* com.spring.aop.*.*(..))")
	public void afterResult() {
		System.out.println("-------this will execute after result method-------");
	}

	@Around("execution(* com.spring.aop.*.*(..))")
	public String aroundResult(ProceedingJoinPoint jp) throws Throwable {

		System.out.println("-------this will execute before result method-------");

		String str = (String) jp.proceed();

		System.out.println("-------this will execute after result method-------");

		return str;
	}
}
