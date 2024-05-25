package org.masteraop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(* org.masteraop.ShoppingCart.checkout())")
//    public void beforelogger(){
//        System.out.println("SPXXX :: inside beforelogger function of LoggingAspect  Class Aspect.....");
//    }

    @Before("execution(* org.masteraop.ShoppingCart.checkout())")
    public void beforelogger(JoinPoint jp){
        System.out.println("SPXXX :: inside beforelogger function of LoggingAspect  Class Aspect..... Signature :: "+ jp.getSignature());
        System.out.println("SPXXX :: inside beforelogger function of LoggingAspect  Class Aspect..... Args :: "+ Arrays.toString(jp.getArgs()));
        System.out.println("SPXXX :: inside beforelogger function of LoggingAspect  Class Aspect.....");
    }


    @After("execution(* org.masteraop.ShoppingCart.checkout())")
    public void afterLogger(){
        System.out.println("SPXXX :: inside afterLogger function of LoggingAspect  Class Aspect................");
    }

//    @Before("execution(* *.*.*.greet(..))")
//    public void greetLogger(){
//        System.out.println("SPXXX :: inside greetLogger method of LoggingAspect Class Aspect..................");
//    }

    @Before("execution(* *.*.*.greet(..))")
    public void greetLogger(JoinPoint jp){
        System.out.println("SPXXX :: inside greetLogger method of LoggingAspect Class Aspect.................. Args :: "+jp.getArgs()[0]);
        System.out.println("SPXXX :: inside greetLogger method of LoggingAspect Class Aspect..................");
    }

    @Pointcut("execution(* *.*.*.price(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturnMethod(JoinPoint jp,String retVal){
        System.out.println("SPXXX :: after returning from function return values is :: "+retVal);
    }
}
