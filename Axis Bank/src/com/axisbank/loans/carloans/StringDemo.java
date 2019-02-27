package com.axisbank.loans.carloans;

public class StringDemo {

	public static void main(String[] args) 
	
	{
		
/*String s1="sivateja";
System.out.println(s1);
System.out.println(s1.hashCode());


String s2="Boddu";
System.out.println(s2);
System.out.println(s2.hashCode());


//s1=s1+s2; or

s1=s1.concat(s2);
System.out.println(s1);
System.out.println(s1.hashCode()); //after changes adress also changes for s1 */

		StringBuffer s1=new StringBuffer("sivateja");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer s2=new StringBuffer("boddu");
		System.out.println(s2);
		System.out.println(s2.hashCode());

		s1=s1.append(s2);
		System.out.println(s1);
		System.out.println(s1.hashCode());


		
	}

}
