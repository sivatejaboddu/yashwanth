package com.hdfc.carloans;

public class A
{
	int x =100; //instance or non statcic or global variables(inside the class outside the method)
	static String cname="vmvare";// static (inside the class outside the method)
	static A a;
	
	void m1()

{
		int x=200;
		System.out.println("iam m1 from class A");

		System.out.println(x); 
		System.out.println(cname);       


}
	public void m2()
	{
		a=new A();
		System.out.println(a.x);
	}
	public static void main(String[] args) {
		a=new A();
		a.m1();
		System.out.println(a.x);       
		System.out.println(cname);
		
	}

}

