package com.rituj.exceptionBasics;

public class Test2 {
	
	public static void main(String[] args) {
		dostuf();
		System.out.println(10/0);
	}	
	
	public static void dostuf() {
		doMoreStuff();
		System.out.println("Hi");
	}
	public static void  doMoreStuff() {
		System.out.println("Hello");
	}
}
