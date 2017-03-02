package com.spring.aop;

import org.aspectj.lang.annotation.*;


@Aspect
public class AnnotationLogging {
	
	/** Following is the definition for a pointcut to select
	    *  all the methods available. So advice will be called
	    *  for all the methods.
	    */

	@Pointcut("execution(* com.spring.aop.User.getUserName(..))")
	public void businessService(){}
	
	  /** 
	    * This is the method which I would like to execute
	    * before a selected method execution.
	    */
	@Before("businessService()")
	public void chekcUserBefor(){
		System.out.println("Checking user details befor updating User details in Data Base");
	}
	
	 /** 
	    * This is the method which I would like to execute
	    * after a selected method execution.
	    */
	@After("businessService()")
	public void checkUserAfeterUpdation(){
		System.out.println("Checking user after updated in data base...");
	}
	
	 /** 
	    * This is the method which I would like to execute
	    * when any method returns.
	    */
	@AfterReturning(pointcut="businessService()" ,returning="retVal")
	public void afterReturnCheck(Object retVal){
		System.out.println("Returning:::"+retVal.toString());
	}
	 /**
	    * This is the method which I would like to execute
	    * if there is an exception raised by any method.
	    */
	
	@AfterThrowing(pointcut="businessService()", throwing="ex")
	public void afterThrowingError(IllegalArgumentException ex){
		System.out.println("Throwing ::"+ex.toString());
	}

}
