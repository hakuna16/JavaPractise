package com.rituj.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortings {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("Ram");
		l.add("shayam");
		l.add("Mohan");
		l.add("Rotik");
		l.add("Piyush");
		l.add("Kohli");
		
		System.out.println(l);
		 
		Collections.sort(l);
		
		System.out.println(l);
	}
}
