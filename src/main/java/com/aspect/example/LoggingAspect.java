package com.aspect.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
public class LoggingAspect {
	
	//@Before("execution(* com.aspect.example.CustomerBo.addCustomer(..))")
	//@Before("execution(* com.aspect.example.*.*(..))")
	@Before("execution (@org.springframework.web.bind.annotation.RequestMapping * *(..))")
	public void logbefore(JoinPoint joinPoint){
		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	

}
