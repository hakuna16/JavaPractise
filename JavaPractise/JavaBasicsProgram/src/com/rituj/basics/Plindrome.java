package com.rituj.basics;

import java.util.Scanner;

public class Plindrome {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		int rem=0;
		int p = 0;
		System.out.println("Enter the no to be chaeked for the palindrome");
		
		n=s.nextInt();
		while(n>0){
			rem = n%10;
			n=n/10;
			p=p*10+rem;
			
		}
		 System.out.println(p);
	}
}
