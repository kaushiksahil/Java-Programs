package com.Employee;

public class Employee {
	int Emp_ID = 101;
	String name = "Sahil";
	String address = "Noida";

	public String printEmployeeDetail() {
		return "ID: " + Emp_ID + " Name: " + name + " Address: " + address;
	}

	public void setDetail(int ID, String name, String address) {
		this.Emp_ID = ID;
		this.name = name;
		this.address = address;
		System.out.println("Employee Set Method......");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("Employee Set Method Ends....");
	}

	public synchronized void getPrint() {
		System.out.println("Start.................Print Method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ended.....Print Method");
	}

}
