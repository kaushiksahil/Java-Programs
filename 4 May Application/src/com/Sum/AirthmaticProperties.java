package com.Sum;

public class AirthmaticProperties {
	int number1;
	int number2;

	public synchronized void getAirthmatic() {
System.out.println("Control Inside SynCHroniZEd Method....");
System.out.println();
		int sum = number1 + number2;
		System.err.println("Sum is " + sum);

		int subtraction = number1 - number2;
		System.out.println("Subtraction is " + subtraction);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int multiplication = number1 * number2;
		System.err.println("Multiplication is " + multiplication);

		int division = number1 / number2;
		System.out.println("Division is " + division);
		
		System.out.println("Control Outside SynCHroniZEd Method....");
	}

}
