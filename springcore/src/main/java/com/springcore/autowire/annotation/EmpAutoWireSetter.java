package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpAutoWireSetter {

	
	private Address address;

	public EmpAutoWireSetter(Address address) {
		super();
		this.address = address;
		System.out.println("under constructor of EmpAutoWireSetter************");
	}

	public EmpAutoWireSetter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		System.out.println("under setting method of se addes of ..EmpAutoWireSetter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
