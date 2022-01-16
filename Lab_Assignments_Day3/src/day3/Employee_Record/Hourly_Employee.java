package day3.Employee_Record;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
	Scanner scn=new Scanner(System.in);
    Hourly_Employee(String Ename, String ein, String Emp_Type) {
		super(Ename, ein, Emp_Type);
	}
   

	@Override
	Double getSalary() {
		setSalary();
		System.out.println("Enter the number of hours "+ Ename+" has worked");
		int h=scn.nextInt();
		double salary=rate*h;
		return salary;
	}


	@Override
	void setSalary() {
		System.out.println("Enter hourly rate");
		int rate=scn.nextInt();
		this.rate=rate;
	}    
	@Override
	public double getPayment() {
		return getSalary();
	} 
}
