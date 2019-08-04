package com.codefountain.spring.core.aop.basic;


import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect  {

	Logger logger = Logger.getLogger(CalculatorLoggingAspect.class.getName());
	
	//@Before("execution(* ArithmeticCalculator.multiplication(..))")
	public void logBefore() {
		logger.info("Before method multiplication");
	}
	
	//@After("execution(* ArithmeticCalculator.addition(..))")
	public void logAfter(JoinPoint joinPoint) {
		logger.info("After method addition");
		logger.info(joinPoint.getKind());
		logger.info(joinPoint.getSignature().getName());
		logger.info(joinPoint.getTarget().toString());
	}
	
	//@AfterReturning(pointcut = "execution(* ArithmeticCalculator.addition(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		logger.info("After method addition");
		logger.info(joinPoint.getKind());
		logger.info(joinPoint.getSignature().getName());
		logger.info(joinPoint.getTarget().toString());
		logger.info("Result is "+result);
	}
	
	@AfterThrowing(pointcut = "execution(* ArithmeticCalculator.division(..))", throwing = "ex")
	//@Before("execution(* ArithmeticCalculator.divison(..))")
	public void logAfterThrowing(JoinPoint joinPoint) {
		logger.info("After method division");
		logger.info(joinPoint.getKind());
		logger.info(joinPoint.getSignature().getName());
		logger.info(joinPoint.getTarget().toString());
		//logger.info("Exception is "+ex.getMessage());
	}
	
	//@Around("execution(* ArithmeticCalculator.division(..))")
	public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info("After method division");
		Object result = null;
		logger.info("Arguments "+Arrays.toString(proceedingJoinPoint.getArgs()));
		try {
			result = proceedingJoinPoint.proceed(new Object[] {1,2});
			return result;
		}
		catch(Throwable e) {
			System.err.println("Arithmetic Exception. Contact system administrator.");
			throw e;
		}
	}
	
	//@Before("execution(* ArithmeticCalculator.division(..))")
	public void logJoinPointInformation(JoinPoint joinPoint) {
		logger.info("After method division");
		logger.info("Kind: "+joinPoint.getKind());
		logger.info("Method Signature name:"+joinPoint.getSignature().getName());
		logger.info("Declaring type name:"+joinPoint.getSignature().getDeclaringTypeName());
		logger.info("Method Arguments:"+Arrays.toString(joinPoint.getArgs()));
		logger.info("Target :"+joinPoint.getTarget().toString());
		logger.info("This class:"+joinPoint.getThis().getClass().getName());
	}

	/*
	 * @Override public int getOrder() { return 0; }
	 */
	
	
}
