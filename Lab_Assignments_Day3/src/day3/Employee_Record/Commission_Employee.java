package day3.Employee_Record;

import java.util.Scanner;

public class Commission_Employee extends Employee {
	Scanner scn=new Scanner(System.in);
    Commission_Employee(String Ename, String ein, String Emp_Type) {
		super(Ename, ein, Emp_Type);
	}
   

	@Override
	Double getSalary() {
		setSalary();
		System.out.println("Enter the number of weekly sale of "+ Ename);
		int w=scn.nextInt();
		double salary=rate*w/100;
		return salary;
	}


	@Override
	void setSalary() {
		System.out.println("Enter weekly percetage rate");
		int rate=scn.nextInt();
		this.rate=rate;
	}   
	@Override
	public double getPayment() {
		return getSalary();
	} 
}
