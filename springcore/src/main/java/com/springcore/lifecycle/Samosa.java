package com.springcore.lifecycle;

public class Samosa {
	private int price;

	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		System.out.println("setting price");
		this.price = price;
	}


	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init()
	{
		System.out.println("init");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
	
	
	public void hi()
	{
		System.out.println("hi");
	}
	public void bye()
	{
		System.out.println("bye");
	}
	
	

}
