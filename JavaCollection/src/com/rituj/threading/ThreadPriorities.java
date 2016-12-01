package com.rituj.threading;

class MyThread7 extends Thread {

}

public class ThreadPriorities {
	/*
	 * Every thread in java have some priorities the maximum priority is = 10
	 * and minimum priority is = 1
	 * ==============================================
	 * there are two method defined in Thread
	 * cla i.e public final int getPriority(); public final void
	 * setPriority(int p); where p is the priority that is assigned to the
	 * thread.
	 * ==================================================================
	 * Default priority is 5
	 */
	public static void main(String[] arg) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(7);

		MyThread7 t = new MyThread7();
		System.out.println(t.getPriority());
	}
}
