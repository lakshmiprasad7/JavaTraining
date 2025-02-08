package MultiThreading;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread2 t1=new TestThread2();
		TestThread runnable=new TestThread();
		Thread t2=new Thread(runnable);
		Counter o=new Counter()	;
		Thread t3=new Thread(()->{
		for(int i=0;i<5;i++) {
			((Counter)o).incrementCount();
		}});
		Thread t4=new Thread(()->{
			for(int i=0;i<5;i++) {
				((Counter) o).incrementCount();
			}});
//		t1.start();System.out.println("Taking order:");
//		t2.start();
		t3.start();
		t4.start();
//		t1.run();
		try {
//			t1.join();
//			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed "+ o.getCount());
		System.out.println("completed");
	}

}
