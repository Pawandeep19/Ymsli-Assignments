package day1.q3;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     /*Enter the number of students: 3
		     Enter the grade for student 1: 55
		     Enter the grade for student 2: 108
		     Invalid grade, try again...
		     Enter the grade for student 2: 56
		     Enter the grade for student 3: 57
		     The average is: 56.0*/
		
		       Scanner scn=new Scanner(System.in);
		       System.out.println("Enter the number of students:");
		       int n=scn.nextInt();
		       int arr[]=new int[n];
		       int sum=0;
		       for(int i=0;i<n;i++) {
		    	   System.out.println("Enter the grade for student "+ (i+1)+" : ");
		    	   int temp=scn.nextInt();
		    	   if(temp<0 || temp>100) {
		    		   System.out.println("Invalid grade, try again...");
		    		   i--;
		    		   continue;
		    	   }
		    	   else {
		    		   arr[i]=temp;
		    		   sum+=arr[i];
		    	   }
		       }
		       double avg=sum/n;
		       System.out.println("The average is: "+avg);
	}

}
