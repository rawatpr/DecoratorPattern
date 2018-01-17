package com.cass.dana;

/**
 * 
 * @author Praveen Rawat
 * 
 * This is the concrete Decorator. There can be any number of such type.
 *
 */
public class SportsCar extends CarDecorator{

	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble()
	{
		super.assemble();
		System.out.println("Adding features to Sports Car!!!");
	}

}
