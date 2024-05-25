package org.masteraop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.masteraop.ShoppingCart.checkout())")
    public void beforelogger(){
        System.out.println("SPXXX :: inside beforelogger function of LoggingAspect  Class Aspect.....");
    }
    @After("execution(* org.masteraop.ShoppingCart.checkout())")
    public void afterLogger(){
        System.out.println("SPXXX :: inside afterLogger function of LoggingAspect  Class Aspect................");
    }

    @Before("execution(* *.*.*.greet(..))")
    public void greetLogger(){
        System.out.println("SPXXX :: inside greetLogger method of LoggingAspect Class Aspect..................");
    }
}
