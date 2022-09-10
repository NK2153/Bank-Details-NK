package org.bank;

public class AxisBank extends BankInfo {

	@Override
	public void savings() {
		System.out.println("34568734567%");
		
	}

	@Override
	public void fixed() {
		System.out.println("45%");
		
	}

	@Override
	public void deposit() {
System.out.println("34567%");		
	}
	public static void main(String[] args) {
		AxisBank aa = new AxisBank();
		aa.savings();
		aa.fixed();
		aa.deposit();
	}

}
