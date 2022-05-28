package org.Bank;

public class AxisBank {
	public void deposit() {
		System.out.println("Axis deposit rate according to Axis rules");
	}

	public static void main(String[] args) {

		AxisBank axisbk = new AxisBank();
		axisbk.deposit();

		//To access Parent class method in child class having overriding method in child class
		BankInfo bk = new BankInfo();
		bk.deposit();

	}

}
