package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi  implements InitializingBean,DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting perspis price ");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public void destroy() throws Exception {
		System.out.println("pepsi dstroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("pespi init");
		
	}
	
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	

}
