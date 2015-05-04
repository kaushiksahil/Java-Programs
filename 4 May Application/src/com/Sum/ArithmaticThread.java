package com.Sum;

public class ArithmaticThread implements Runnable {
	String threadName;
	AirthmaticProperties objAirthmaticProperties;

	ArithmaticThread(String threadName, AirthmaticProperties obj) {
		this.threadName = threadName;
		System.out.println("Thread Name ...." + threadName);
		this.objAirthmaticProperties = obj;
	}

	public void run() {
		System.out.println("Run Method.........." + threadName);
		objAirthmaticProperties.getAirthmatic();
		System.out.println("Ended..........................");

	}

}
