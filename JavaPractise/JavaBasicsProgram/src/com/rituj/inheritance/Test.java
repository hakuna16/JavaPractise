package com.rituj.inheritance;

class p {
	public void m1() {
		System.out.println("Parent");
	}
}
class c extends p{
	public void m2() {
		System.out.println("Child");
	}
}
public class Test {

	public static void main(String[] args) {
		p p1 = new p();
		p1.m1();
		 
	}
}
