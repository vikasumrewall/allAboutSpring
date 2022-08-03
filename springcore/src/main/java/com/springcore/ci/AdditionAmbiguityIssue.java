package com.springcore.ci;

public class AdditionAmbiguityIssue {
	int a;
	int b;
	
	

	AdditionAmbiguityIssue(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("interger=");
		
		
	}
	AdditionAmbiguityIssue(double c,double d)
	{
		this.a=(int)c;
		this.b=(int)d;
		System.out.println("Double=");
		
		
	}
	AdditionAmbiguityIssue(long c,long d)
	{
		this.a=(int)c;
		this.b=(int)d;
		System.out.println("Long=");
		
		
	}
	AdditionAmbiguityIssue(String e,String f)
	{
		this.a=Integer.parseInt(e);
		this.b=Integer.parseInt(f);
		System.out.println("String=");
		
		
	}
	
	
	public int sum()
	{
		System.out.println("a==="+a);
		System.out.println("b===="+b);
		return a+b;
	}
	@Override
	public String toString() {
		return "AdditionAmbiguityIssue [a=" + a + ", b=" + b + "]";
	}
	
	
}
