package com.Employee;

public class EmployeeThread implements Runnable {
	private String threadName;
	private Employee employee;

	public EmployeeThread(String threadName, Employee obj) {
		this.threadName = threadName;
		System.out.println("Thread Loading....");
		Thread objectThread = new Thread(this);
		objectThread.start();
		this.employee = obj;
	}

	public void run() {
		/*
		 * System.out.println("Run Method Starts with name ......." +
		 * threadName); System.out.println(threadName +
		 * employee.printEmployeeDetail()); System.out.println();
		 * System.out.println(threadName + "  Editing Details.....");
		 * employee.setDetail(102, "Sumit", "Gurgaon"); System.out.println();
		 * System.out.println(threadName + employee.printEmployeeDetail());
		 * System.err.println(threadName + " has been Modified");
		 */
		// System.out.println("Run Method....Thread>>>" + threadName);/*

		employee.getPrint();

	}

}
