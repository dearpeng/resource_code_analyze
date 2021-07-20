package com.luban.springsourcecodeanalysis.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by PengWX on 2021/5/13.
 */
@Aspect
@Component
public class UserServiceAspect {
   /* @Before("execution(public void com.luban.springsourcecodeanalysis.service.impl.UserServiceImpl.testAspect())")
    public void beforeA() {
        System.out.println("userServiceAspect 执行");
    }*/

    @Pointcut("@annotation(com.luban.springsourcecodeanalysis.aspects.AopAnnotation)")
    public void aop() {

    }

    @AfterReturning("aop()")
    public void testAfterReturning() {
        System.out.println("testReturn 执行44444444444444444444!");
    }

    @AfterThrowing("aop()")
    public void testAfterThrowing() {
        System.out.println("AfterThrowing 执行33333333333333333!");
    }

    @Around("aop()")
    public void testAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around 执行66666666666666666666!");
        joinPoint.proceed();
        System.out.println("Around 执行555555555555555555555!");
    }

    @Before("aop()")
    public void before() {
            System.out.println("aop before方法开始执行111111111111111111111111");
    }

    @After("aop()")
    public void after() {
        System.out.println("aop after执行22222222222222222222!");
    }


}
