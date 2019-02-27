package com.hdfc.carloans;

public class ChildClass implements Rbi
{

	public static void main(String[] args) 
	{
		
		ChildClass c1=new ChildClass();
		c1.deposit();
		c1.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overridden withdraw in child class");	
	}

	@Override
	public void deposit() {
		System.out.println("iam overridden deposit in child class");	
		
	}

}
