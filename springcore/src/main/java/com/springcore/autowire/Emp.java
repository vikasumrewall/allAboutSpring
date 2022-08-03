package com.springcore.autowire;

public class Emp {
private Address address;

public Emp(Address address) {
	super();
	this.address = address;
	System.out.println("under constructor of Emp");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	System.out.println("under setting method of se addes");
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}


}
