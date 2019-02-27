package com.hdfc.carloans;

public class FirstClass 
{
	int a=10,b=20,c;
	public void add()
	{
		c=a+b;
		System.out.println("addition of A & B is : " + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("subtraction of A & B is :" + c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi iam first class");
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
		
		
	}

}
