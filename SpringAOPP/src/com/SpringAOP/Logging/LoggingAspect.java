package com.SpringAOP.Logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.SpringAOP.Models.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint jointpoint){ // if i want to specify which methods getters or setters method use jointpoint//
		System.out.println(jointpoint.toString());
		System.out.println(jointpoint.getTarget()); // i can also use getTarget method//AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAA	
	//Circle circle = (Circle)jointpoint.getTarget();// also you can use like this//
	}
	@Before("args(String)")
	public void StringArgumentMethod(){
		System.out.println("A method takes a string argument has been called");
	}
	
	
 @Before("allGetters()")
	public void loggingAdvice(){
		System.out.println("Advice run.Get method called");
	}
 @Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("Second Advice is called");
	}
 @Before("allGetters() && allCircleMethods()")// this method called both get and circle methods you can also combine this//
 public void loggingAdvice1(){
		System.out.println("Advice all method called");
	}
@Pointcut("execution(* get*())")
public void allGetters(){
	
}

@Pointcut("within(com.SpringAOP.Models.Circle)") //if you want run specify class methods//
public void allCircleMethods(){

}




}
