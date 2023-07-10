package com.tnsif.springioc;

public class SBICard implements DebitCard{

	@Override
	public void deposit() {
		System.out.println("SBI- depositing an amount of 1 lakh rupees");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI- withdrawing an amount of 20 thousand");
		// TODO Auto-generated method stub
		
	}

}
