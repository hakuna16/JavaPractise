package com.rituj.abstractFactory;

public class FactoryPoducer {
	
	public static AbstractFactory getAbstractFactory(String choice){
		
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		
		if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		
		return null;
		
		
	}
}
