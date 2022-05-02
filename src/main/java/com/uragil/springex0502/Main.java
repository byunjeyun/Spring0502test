package com.uragil.springex0502;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator myCal = new MyCalculator();
		Calculator cal = new Calculator();
		
		myCal.setCalcu(cal);
		
		myCal.setA(10);
		myCal.setB(20);
		
		myCal.add();
	}

}
