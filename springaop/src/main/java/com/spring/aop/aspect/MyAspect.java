package com.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
public class MyAspect {
	
	/*
	 * this it will call before payment
	 */
	
	@Before("execution( * com.spring.aop.service.PaymentServiceImpl.payment(..))")
	public void callBefrePaymentMethod()
	{
	System.out.println("called before...");	
	}
	
   @After("execution( * com.spring.aop.service.PaymentServiceImpl.payment(..))")
	public void callAfterPaymentMethod()
	{
	System.out.println("called after...");	
	}
	

}
