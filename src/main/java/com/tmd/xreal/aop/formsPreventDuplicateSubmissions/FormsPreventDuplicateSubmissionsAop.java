package com.tmd.xreal.aop.formsPreventDuplicateSubmissions;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zxw
 * @date 2020-01-07 11:38
 */
@Aspect
@Component
public class FormsPreventDuplicateSubmissionsAop {

    @Before("@annotation(com.tmd.xreal.aop.formsPreventDuplicateSubmissions.FormsPreventDuplicateSubmissionsAnnotation)")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        //获取参数,从
    }

}
