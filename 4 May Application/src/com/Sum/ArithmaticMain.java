package com.Sum;

public class ArithmaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirthmaticProperties objProperties = new AirthmaticProperties();
		objProperties.number1 = 20;
		objProperties.number2 = 10;
		ArithmaticThread objThread1 = new ArithmaticThread("Thread 1",
				objProperties);
		ArithmaticThread objThread2 = new ArithmaticThread("Thread 2",
				objProperties);
		Thread objectThread = new Thread(objThread1);
		Thread objectThread1 = new Thread(objThread2);
		objectThread.start();
		System.out.println("-----------------------------");
		objectThread1.start();

	}

}
