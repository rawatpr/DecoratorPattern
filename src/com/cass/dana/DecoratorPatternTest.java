/**
 * 
 */
package com.cass.dana;

/**
 * @author Praveen Rawat
 * 
 * 
 *
 */
public class DecoratorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		Car luxuryCar =  new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
	}

}
