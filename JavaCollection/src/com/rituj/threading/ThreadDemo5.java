package com.rituj.threading;

class MyThread5 extends Thread{
	
	public void start(){
		super.start();
		System.out.println("Start method called");
	}
	public void run(){
		System.out.println("run Method Called");
	}
	
}
public class ThreadDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("Main Method");
		t.start();
	}

}
