package com.rituj.collection;

import java.util.ArrayList;

public class ArrayListToString {

		public static void main(String[] args) {
			
			ArrayList l = new ArrayList();
			l.add("Ram");
			l.add("shayam");
			l.add("Mohan");
			l.add("Rotik");
			l.add("Piyush");
			l.add("Kohli");
			
			System.out.println(l);
			 
			for (Object list : l) {
				
				System.out.println(list.toString());
				
			}
			
		}
}
