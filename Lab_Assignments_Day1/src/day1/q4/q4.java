package day1.q4;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter the size of array: ");
	    int n=scn.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=scn.nextInt();
	    }
        int ans[]=copyOf(arr);
        for(int i=0;i<ans.length;i++) {
        	System.out.print(ans[i]+" ");
        }

	}
	public static int[] copyOf(int[] array) {
		int ans[]=new int[array.length];
		for(int i=0;i<array.length;i++) {
			ans[i]=array[i];
		}
		return ans;
	}

}
