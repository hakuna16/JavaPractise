package com.rituj.exceptionBasics;

public class TestException2 {

	public static void main(String[] args) throws ArithmeticException {
		
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		//System.out.println(e);
		//System.out.println(e.getMessage());
	}
	
	}
}
