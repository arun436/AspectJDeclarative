package com.arun.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectBean {
	
	public void before(JoinPoint jp) {
		System.out.println("Before " + jp.getSignature().getName() + " Execution");
	}
	
	public void after(JoinPoint jp) {
		System.out.println("After " + jp.getSignature().getName() + " Execution");
	}
	public void afterReturning(JoinPoint jp,Object results) {
		System.out.println("After returning " + results + " from " + jp.getSignature().getName()); 
	}
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Before " + jp.getSignature().getName() + " Execution from around advice");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After " + jp.getSignature().getName() + " Execution from around advice");
		
	}
	public void afterThrowing(JoinPoint jp,Throwable exception) {
		System.out.println("After throwing expression " + exception + " from " + jp.getSignature().getName() + " method");
	}
}
