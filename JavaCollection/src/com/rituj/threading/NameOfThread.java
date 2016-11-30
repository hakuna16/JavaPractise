package com.rituj.threading;

/*we can get & set the name of the thread by using the following Methods.
	1. public final String getName();
	2. public final void SetName(String Name);*/

class MyThread6 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HI... i am from the thread class");	
	}
}

public class NameOfThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(Thread.currentThread().getName());
		
		MyThread6 t = new MyThread6();
		
		System.out.println("hello");
	}

}
