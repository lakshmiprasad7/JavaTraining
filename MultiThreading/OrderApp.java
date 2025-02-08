package MultiThreading;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takeOrder t1=new takeOrder();
		processPayment p1=new processPayment();
		assignDA a1=new assignDA();
		
			t1.start();
			p1.start();
			a1.start();
			try {
				t1.join();
				p1.join();
				a1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("order process completed.");
	}

}
