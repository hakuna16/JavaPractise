package com.rituj.exceptionBasics;

public class Test3 {

	static ArithmeticException ae = new ArithmeticException();
	
	public static void main(String[] args) {
		throw ae;
	}
}
