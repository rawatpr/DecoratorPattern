/**
 * 
 */
package com.cass.dana;

/**
 * @author Praveen Rawat
 * 
 * This is another concrete decorator.
 *
 */
public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.cass.dana.CarDecorator#assemble()
	 */
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features to Luxury Car!!!");
	}

}
