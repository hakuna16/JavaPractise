package com.rituj.threading;

class Thread_1 extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo1 {
	
	Thread mt = Thread.currentThread();
	Thread_1 t = new Thread_1();
	t.start();
	
	
}
