package day2.Student_ques;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		
		Student student1 = new Student("1234");
		student1.display();
		Student student2 = new Student("Pawan","1234");
		student2.display();
		Student student3 = new Student("Pawan","1234",90);
		student3.display(2022);
		
		
		
		//MENU- DRIVEN
		
		
		// TODO Auto-generated method stub
//		Student s=null;
//		Scanner scn=new Scanner(System.in);
//		while(true) {
//			System.out.println("Menu");
//			System.out.println("Enter 1: To create  a new student");
//			System.out.println("Enter 2: To display student");
//			System.out.println("Enter 3: To exit");
//			int choice=scn.nextInt();
//			
//			
//			if(choice==1) {
//				System.out.println("Enter Student id");
//				String id=scn.next();
//				String name="";
//				Double grade=0.0;
//				//name
//				System.out.println("Do you want to provide a name (Y/N)");
//				String ch=scn.next();
//				if(ch.contentEquals("Y")) {
//					System.out.println("Enter Name:");
//					name=scn.nextLine();
//					scn.next();
//					//grade
//					System.out.println("Do you want to provide a grade (Y/N)");
//					String ch2=scn.next();
//					scn.next();
//					if(!ch2.contentEquals("N")) {
//						System.out.println("Enter Grade:");
//						grade=scn.nextDouble();
//					}
//				}
//				else {
//					s=new Student(id);
//				}
//				
//                if(name!="" && grade==0.0) {
//					s=new Student(name,id);
//				}
//				else {
//					s=new Student(name,id,grade);
//				}				
//				
//			}
//			
//			
//			else if(choice==2) {
//				if(s==null) {
//					System.out.println("No students to display");
//					break;
//				}
//				System.out.println("Do you want to enter the student's current year?(Y/N)");
//				String ch=scn.next();
//				if(ch.contentEquals("Y")) {
//					System.out.println("Enter Year");
//					int year=scn.nextInt();
//					s.display(year);
//				}
//				else {
//					s.display();
//				}
//			}
//			
//			
//			else {
//				break;
//			}
//		}

	}

}
