package com.hdfc.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) {

		Icici i=new Icici();
		i.withdrawl();
		i.deposit();
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overridden withdrawl in Icici ");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden deposit is Icici ");
		
	}

}
