package day2.circle_ques;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(5);
		System.out.println(circle.getArea());
          
	}

}
class Circle{
	private double radius;
	private String color;
	Circle(){
		radius=1.0;
		color="red";
	}
	Circle(double r){
		this.radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

