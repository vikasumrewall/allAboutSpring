package com.spring.aop.service;


public class PaymentServiceImpl implements PaymentService {

	public void payment(int amount) {
		
		System.out.println("amount debited"+amount);

	}

}
