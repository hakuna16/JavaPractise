package com.rituj.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//SingleObject s = new SingleObject();
		
		
		SingleObject so = SingleObject.getInstance();
		so.showMessage();
	}

}
