package com.rituj.threading;


class MyThread1 extends Thread{
	
	public void  run() {
		System.out.println("no-argument Method");
	}
	public void run(int a){
		System.out.println("var-argument Method");
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
