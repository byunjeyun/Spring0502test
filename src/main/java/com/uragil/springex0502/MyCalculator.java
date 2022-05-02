package com.uragil.springex0502;

public class MyCalculator {

	private int a;
	private int b;
	
	Calculator calcu;
	
	public void add() {
		calcu.addition(a, b);
	}
	
	public void sub() {
		calcu.subtraction(a, b);
	}
	
	public void mul() {
		calcu.multiple(a, b);
	}
	
	public void div() {
		
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setCalcu(Calculator calcu) {
		this.calcu = calcu;
	}
	
}


