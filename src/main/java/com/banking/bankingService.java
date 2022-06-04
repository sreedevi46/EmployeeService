package com.banking;

public class bankingService {
	
	private double balance=10000;
	
	public void withaDraw(double amount) {
		
		this.balance=this.balance -amount;
	}

}
