package com.rituj.impot;

enum color{
	BLUE,RED,GREEN;
	
	public void info(){
		System.out.println("universal colors " + name());
	}
}
public class Test {
	
	public static void main(String[] args) {
		color[] c = color.values();
		for (color color2 : c) {
			color2.info();
		}
	}
}