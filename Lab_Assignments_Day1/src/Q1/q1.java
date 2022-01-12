package Q1;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
		F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1.*/
		int n=20;
		int arr[]=new int[n];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		double avg;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		avg=sum/n;
		System.out.println("The average is : "+avg);
	}

}
