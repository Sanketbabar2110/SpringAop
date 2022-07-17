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

//	@Before("execution(* com.spring.aop.*.*(..))")
//	public void beforeResult() {
//		System.out.println("************THIS METHOD EXECUTES BEFORE RESULT METHOD*************");
//	}
//
//	@AfterThrowing("execution(* com.spring.aop.*.*(..))")
//	public void afterThrowingResult() {
//		System.out.println("*********THIS METHOD EXECUTES AFTER THROWING RESULT METHOD*********");
//	}
//
//	@AfterReturning("execution(* com.spring.aop.*.*(..))")
//	public void afterReturningResult() {
//		System.out.println("****THIS METHOD EXECUTES AFTER SUCCESSFUL RETURNING RESULT METHOD****");
//	}
//	
//	@After("execution(* com.spring.aop.*.*(..))")
//	public void afterResult() {
//		System.out.println("*********THIS WILL EXECUTES AFTER RESULT METHOD**********");
//	}

	@Around("execution(* com.spring.aop.*.*(..))")
	public void aroundResult(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("*****THIS WILL EXECUTES BEFORE RESULT METHOD*******");
		jp.proceed();
		System.out.println("*****THIS WILL EXECUTES AFTER RESULT METHOD*******");
	}
}
