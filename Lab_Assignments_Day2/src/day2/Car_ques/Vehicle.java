package day2.Car_ques;

public class Vehicle {

	protected int noOfWheel;
    protected int noOfPassenger;
	protected int model;
	protected String make;
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	

	public void display() {
		System.out.println("company: "+make);
		System.out.println("model: "+model);
		System.out.println("wheels: "+noOfWheel);
		System.out.println("passengers: "+noOfPassenger);
	}
}
