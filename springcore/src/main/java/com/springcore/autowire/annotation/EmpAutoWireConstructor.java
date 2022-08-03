package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpAutoWireConstructor {
	
	
private Address address;


@Autowired
public EmpAutoWireConstructor(Address address) {
	super();
	this.address = address;
	System.out.println("under constructor of EmpAutoWireConstructor...");
}

public EmpAutoWireConstructor() {
	super();
	// TODO Auto-generated constructor stub
}

public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	System.out.println("under setting method of se addes of EmpAutoWireConstructor");
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
}
