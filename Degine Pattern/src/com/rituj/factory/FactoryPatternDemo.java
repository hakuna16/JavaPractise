package com.rituj.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("CIRCLE");
			shape1.draw();
		
		Shape shape2 = sf.getShape("RECTANGLE");
			shape2.draw();
			
		Shape shape3 = sf.getShape("SQUARE");
			shape3.draw();		
	}

}
