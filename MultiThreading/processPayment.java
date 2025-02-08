package MultiThreading;

public class processPayment extends Thread{
	
		
	@Override
	public void run() {
		try {
			System.out.println("Processing Payment..");
			Thread.sleep(9000);
			System.out.println("Payment done..");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		System.out.println("Thread is running"+ Thread.currentThread().getName());
	}

}
