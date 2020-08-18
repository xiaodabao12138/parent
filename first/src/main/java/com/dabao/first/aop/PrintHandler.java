package com.dabao.first.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
* 切面的模板
* */
@Aspect
@Component
public class PrintHandler {

    /**
     * 切入点，将注解标记为切入点，贴有这个注解的方法就为切面
     */
    @Pointcut("@annotation(com.dabao.first.annotation.Performance)")
    public void controllerAspect() {
    }

    /**
     * 切入前执行，记录请求开始时间
     */
    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("begain");
    }

    /**
     * 返回后执行
     */
    @AfterReturning(returning = "ret", pointcut = "controllerAspect()")
    public void doAfterReturning(JoinPoint joinPoint, Object ret) throws Throwable {
        System.out.println("end");
    }

    @AfterThrowing(throwing = "ex", pointcut = "controllerAspect()")
    public void doAfterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("exception");
    }
}
