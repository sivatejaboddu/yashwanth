package com.hdfc.carloans;

public class ChildClass5 extends FirstAbstarct 
{

	public static void main(String[] args) 
	{
		ChildClass5 c=new ChildClass5();
		c.m1();
		c.m2();
	
	}
	public void m1()
	{
		System.out.println("i am overridden m1 from ChildClass5 ");
		
	}

	//@Override
	public void m2()
	{
				
		System.out.println("i am overridden m2 in ChildClass5 ");
		
	}

}
