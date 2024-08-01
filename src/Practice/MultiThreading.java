package Practice;

public class MultiThreading implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Child thread");
		}
	}
	
	public static void main(String[] args) {
		
		MultiThreading t = new MultiThreading();
		Thread t1 = new Thread(t);
		t1.start();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Main Thread");
		}
	}

}
