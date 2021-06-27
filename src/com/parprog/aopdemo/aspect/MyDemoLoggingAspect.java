package com.parprog.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	
	// pointcut expression with any return type
	// *(1 anytype parameter) &  ..(0<= any parameter)
	@Before("execution(* add*(com.parprog.aopdemo.dao.Account,..))")
	public void beforeAddAdvice() {
		System.out.println("\n======>>>> Executing @Before advice on addAccount()");
	}
}
