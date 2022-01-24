package day6.q1;


class job implements Runnable{

	@Override
	public void run() {
		for(int counter=1; counter<=4; counter++) {
			System.out.println("[ Thread Name- " + Thread.currentThread().getName() + " and Thread Number:  "+counter+" ]");
		}
	}
	
}

public class q1 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread( new job(),"Thread 1: " );
		Thread thread2 = new Thread( new job(),"Thread 2: " );
		Thread thread3 = new Thread( new job(),"Thread 3: " );
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
