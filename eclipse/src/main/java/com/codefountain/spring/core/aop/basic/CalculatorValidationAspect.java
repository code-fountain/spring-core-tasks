package com.codefountain.spring.core.aop.basic;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class CalculatorValidationAspect /* implements Ordered */{
	
	//@Before("execution(* ArithmeticCalculator.division(..))")
	public void validateArgs(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		for(Object obj : args) {
			if((double)obj <= 0) {
				throw new IllegalArgumentException("Numbers must be positive only");
			}
		}
	}

	/*
	 * @Override public int getOrder() { return 1; }
	 */
}
