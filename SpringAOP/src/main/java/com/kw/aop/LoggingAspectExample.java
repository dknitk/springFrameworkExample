package com.kw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspectExample {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspectExample.class);
	
	@Around("execution(* com.kw..*(..)))")
	public Object logMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		MethodSignature methodSignature = (MethodSignature)proceedingJoinPoint.getSignature();
		final StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();
		
		LOGGER.info("KnowledgeWala - Spring Boot AOP Example"
				+ methodSignature.getDeclaringType().getSimpleName()
				+ "." + methodSignature.getName() + " "
				+ "::" + stopWatch.getTotalTimeMillis() + " ms");
		
		return result;
	}
	@Before("execution(* com.kw..*(..)))")
	public void logBeforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		LOGGER.info("Before method execution: " + methodName);
	}
	
	@AfterReturning("execution(* com.kw..*(..)))")
	public void logAfterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		LOGGER.info("After method execution: " + methodName);
	}
	
	@AfterThrowing("execution(* com.kw..*(..)))")
	public void logAfterExceptionMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		LOGGER.info("AfterException method execution: " + methodName);
	}
}
