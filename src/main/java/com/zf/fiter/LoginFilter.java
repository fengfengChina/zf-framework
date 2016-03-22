package com.zf.fiter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * LoginFilter
 *
 * @author zf
 * @date 16/3/20
 */
@Aspect
@Component
public class LoginFilter {

//    @Before("execution(* com.zf.controller.loginQx.*(..))")
//    public void logServiceAccess(JoinPoint joinPoint) {
//        System.out.println("login----start: " + joinPoint);
//
//        System.out.println("login-- --end: " + joinPoint);
//    }
}
