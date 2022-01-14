package day2.Student_ques;

public class Student {
     protected String name="N/A";
     protected String id="N/A";
     protected double grade=0.0;
     Student(String name,String id, double grade){
    	 this(name,id);
    	 this.grade=grade;
    	 
     }
     Student(String name,String id){
    	 this(id);
    	 this.name=name;
     }
     Student(String id){
    	 this.id=id;
     }
     public void display() {
    	 
    	 System.out.println("Name: "+name+" id: "+id+" grade: "+grade);
     }
     public void display(int year) {
    	 display();
    	 System.out.println("Current year: "+year);
     }
     
}
