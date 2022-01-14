package day2.Car_ques;

import java.util.Scanner;

public class Car_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1 for: Vehicle");
		System.out.println("Enter 2 for: Car");
		System.out.println("Enter 3 for: Convertible");
		System.out.println("Enter 4 for: Sports");
		int choice=scn.nextInt();
		System.out.println("Enter car details:");
		System.out.println("enter no of wheels");
		int w=scn.nextInt();
		System.out.println("enter no of passengers");
		int p=scn.nextInt();
		System.out.println("enter no model year");
		int m=scn.nextInt();
		System.out.println("Enter company");
		String company=scn.next();
		Vehicle vehicle;
		if(choice==1) {
			vehicle=new Vehicle(w,p,m,company);
			vehicle.display();
		}
		else if(choice==2) {
			System.out.println("enter no of doors");
			int noOfDoors=scn.nextInt();
			vehicle=new Car(w,p,m,company,noOfDoors);
			vehicle.display();
		}
		else if(choice==3) {
			System.out.println("enter no of doors");
			int noOfDoors=scn.nextInt();
			System.out.println("is hood open(true/false)");
			boolean ish=scn.hasNextBoolean();
			vehicle=new Convertible(w,p,m,company,noOfDoors,ish);
			vehicle.display();
		}
		else if(choice==4) {
			vehicle=new SportsCar(w,p,m,company);
			vehicle.display();
		}

	}

}
