package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpAutoWirePorpperty {
	
@Autowired	
private Address address;



public EmpAutoWirePorpperty(Address address) {
	super();
	this.address = address;
	System.out.println("under constructor of EmpAutoWirePorpperty<><><>");
}

public EmpAutoWirePorpperty() {
	super();
	// TODO Auto-generated constructor stub
}

public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	System.out.println("under setting method of se addes of EmpAutoWirePorpperty........");
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}


}
