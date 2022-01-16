package day3.Employee_Record;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	Scanner scn=new Scanner(System.in);
     Salaried_Employee(String Ename, String ein, String Emp_Type) {
		super(Ename, ein, Emp_Type);
	}
    

	@Override
	Double getSalary() {
		setSalary();
		System.out.println("Enter the number of weeks "+ Ename+" has worked");
		int w=scn.nextInt();
		double salary=rate*w;
		return salary;
	}


	@Override
	void setSalary() {
		System.out.println("Enter weekly rate");
		int rate=scn.nextInt();
		this.rate=rate;
	}


	@Override
	//overriding getpayment of interface
	public double getPayment() {
		return getSalary();
	}     
     
}
