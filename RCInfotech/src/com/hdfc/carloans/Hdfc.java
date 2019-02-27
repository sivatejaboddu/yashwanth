package com.hdfc.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) {
		Hdfc h1 = new Hdfc(); 
		h1.deposit();
		h1.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overridden withdrawl in Hdfc ");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden deposite in Hdfc ");
		
	}

}
