package day3.Employee_Record;

import java.util.Scanner;

public abstract class Employee implements Payable{
	    Scanner scn=new Scanner(System.in);
        String ein;
        String Ename;
        String Emp_Type;
        int rate=0;
        
        Employee(){
        	
        }
        Employee(String Ename,String ein,String Emp_Type){
        	this.Ename=Ename;
        	this.ein=ein;
        	this.Emp_Type=Emp_Type;
        }
        abstract Double getSalary();
        abstract void setSalary();
}
