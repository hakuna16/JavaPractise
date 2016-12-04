package com.rituj.exceptionBasics;

public class TestException {
	
	public static void main(String[] args) {
		
		System.out.println("STMT1");
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		System.out.println("hi this is rituj");
	}
}
