package com.rituj.pakage;

enum Beer{
	kf,ko,bd;
}

public class BeerDemo {
 public static void main(String[] args) {
	  Beer beer = Beer.bd;
	  switch(beer){
  case kf: 
		  	System.out.println("hi i am from kf");
		  	break;
	  case ko: 
		  	System.out.println("hi i am from ko");
		  	break;
	  case bd: 
		  	System.out.println("hi i am from bd");
		  	break;
	  default:
		  System.out.println("not recomended");
	  }
}
}