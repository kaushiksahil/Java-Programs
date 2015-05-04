package com.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee objectEmployee = new Employee();
		EmployeeThread objectThread1 = new EmployeeThread("Thread 1",
				objectEmployee);
		EmployeeThread objectThread2 = new EmployeeThread("Thread 2",
				objectEmployee);

	}

}
