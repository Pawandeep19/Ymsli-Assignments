package day3.Employee_Record;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Payable invoice=new Invoice("Fz350","Yamaha Guitar",1,10000);
		Payable emp=new Salaried_Employee("Pawan","YM324","salaried");
		System.out.println(invoice.toString());
		System.out.println("Salary of Employee is: "+emp.getPayment());	
		ArrayList<Employee> list=new ArrayList<>();
		while(true) {
			System.out.println("Menu");
			System.out.println("Enter 1: To Add An Employee");
			System.out.println("Enter 2: To Display All Employees");
			System.out.println("Enter 3: To Exit");
			int choice=scn.nextInt();
			if(choice==1) {
				Employee E;
				System.out.println("Enter Employee type (hourly/salaried/commsion)");
	            String Emp_Type=scn.next(); 
				System.out.println("Enter Employe Name");
	            String Ename=scn.next();
	            System.out.println("Enter Employe EIN");
	            String ein=scn.next();
	            if(Emp_Type.equals("hourly")) {
	            	E=new Hourly_Employee(Ename, ein, Emp_Type);
	            }
	            else if(Emp_Type.equals("salaried")) {
	            	E=new Salaried_Employee(Ename, ein, Emp_Type);
	            }
	            else {
	            	E=new Commission_Employee(Ename, ein, Emp_Type);
	            }
	            list.add(E);
			}
			else if(choice==2) {
				//display
				if(list.size()==0) {
	        		System.out.println("No Employees");
	        	}
	        	for(Employee E:list) {
	        		System.out.println("Employee name: "+ E.Ename+"- Employee ID: "+E.ein+"-Employee Type: "+E.Emp_Type+"-Salary: "+E.getSalary());	
	        	}
			}
			else {
				break;
			}
		}

	}

}
