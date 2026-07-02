package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    public LoggingAspect() {
        System.out.println("LoggingAspect created");
    }

    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("\nBefore the Login Method");
        System.out.println("Method : "+joinPoint.getSignature().getName());
    }

    @After("execution(* com.example.service.*..*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("\nAfter the Login Method");
        System.out.println("Method : "+joinPoint.getSignature().getName());
    }

    @Around("execution(* com.example.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature().getName() + " executed in " + executionTime + "ms");
        return proceed;
    }
}