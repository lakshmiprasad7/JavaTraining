package MultiThreading;

public class assignDA extends Thread{
	
		
	@Override
	public void run() {
		try {
			System.out.println("assigning delivery agent");
			Thread.sleep(8000);
			System.out.println("delivery agent assigned");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		System.out.println("Thread is running"+ Thread.currentThread().getName());
	}

}
