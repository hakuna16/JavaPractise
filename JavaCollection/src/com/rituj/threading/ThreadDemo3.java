package com.rituj.threading;

class MyThread3 extends Thread{
	
	public void start() {
		System.out.println("Start Method called");
	}
	
	public void run() {
		System.out.println("run method called");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread3 t = new MyThread3();
		t.start();
		t.run();

	}

}
