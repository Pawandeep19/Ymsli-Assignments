package day2.Car_ques;

public class Convertible extends Car {
	boolean isHoodOpen;
	Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor,boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen=isHoodOpen;
		
	}
	
     public void display() {
    	super.display();
  		System.out.println("Hood status:"+ isHoodOpen);
     }
}
