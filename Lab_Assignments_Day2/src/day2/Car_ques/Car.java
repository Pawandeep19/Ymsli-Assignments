package day2.Car_ques;

public class Car extends Vehicle {
	 int noOfDoor;
     Car(int noOfWheel, int noOfPassenger, int model, String make,int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);		
		this.noOfDoor=noOfDoor;
	}
     
	
     public void display() {
    	super.display();
 		System.out.println("doors: "+noOfDoor);
     }
}
