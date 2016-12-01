package com.rituj.threading;

class MyThread9 extends Thread{
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("THread 1 ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class ThreadJoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread9 t  = new MyThread9();
		t.start();
		t.join();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().join();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread 2 from Main");
		}
		
	}
}