package com.cass.dana;

/**
 * 
 * @author Praveen Rawat
 *
 *         This the decorator class, implementing and with a "HAS A"
 *         relationship with Component Interface.
 *
 *         The Component instance is made protected so that child decorator
 *         classes can access it.
 */
public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c)
	{
		this.car=c;
	}
	@Override
	public void assemble() {
		this.car.assemble();
	}

}
