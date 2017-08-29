package com.xm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//aop执行某个方法的切入点
@Aspect
//组件 这里就是说把这个类交给Spring管理，由于不好说这个类属于哪个层面，就用@Component
@Component
public class AopController {
	private Logger logger=Logger.getLogger(AopController.class);
    
	//对 com.xm.controller包下的任意类，任意方法，任意参数，任意返回值的方法都进行切入
    @Pointcut("execution(public * com.xm.controller.*.*(..))")
    //Point签名 只是签名
    public void log(){
    }
     
    //指定Pointcut签名
    @Before("log()")
    public void deoBefore(JoinPoint joinPoint){
        logger.info("方法执行前...");
        ServletRequestAttributes sra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=sra.getRequest();
        logger.info("url:"+request.getRequestURI());
        logger.info("ip:"+request.getRemoteHost());
        logger.info("method:"+request.getMethod());
        logger.info("class_method:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("args:"+joinPoint.getArgs());
    }
     
    @After("log()")
    public void doAfter(JoinPoint joinPoint){
        logger.info("方法执行后...");
    }
     
    @AfterReturning(returning="result",pointcut="log()")
    public void doAfterReturning(Object result){
        logger.info("执行返回值："+result);
    }
}
