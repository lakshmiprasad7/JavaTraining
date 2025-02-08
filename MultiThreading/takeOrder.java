package MultiThreading;

public class takeOrder extends Thread{
	
		
	@Override
	public void run() {
		try {
			System.out.println("Taking order:");
			Thread.sleep(2000);
			System.out.println("order taken");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		System.out.println("Thread is running"+ Thread.currentThread().getName());
	}

}
