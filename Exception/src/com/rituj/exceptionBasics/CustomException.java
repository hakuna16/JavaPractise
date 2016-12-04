package com.rituj.exceptionBasics;

class TooYoungException extends RuntimeException {
	public TooYoungException(String s) {
		super(s);
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String s1){
		super(s1);
	}
}

public class CustomException {
	
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		
		if(age>60){
			throw new TooYoungException("PLease wait you wil get chance");
		}
		else if(age<18){
			throw new TooOldException("your age is already crossed");
		}
		else
			System.out.println("w8 you will get detail soon");
	}
}
