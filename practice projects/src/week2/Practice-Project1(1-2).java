package week2;

public class Thread2 implements Runnable{
	public static int count =0;
	public Thread2() {
		
	}
	@Override
	public void run() {
		for(count=0;count<=10;++count) {
			try {
			System.out.println("Th1: "+(Thread2.count));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in Thread: "+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread starts");
		Thread2 t =new Thread2();
		Thread t1 = new Thread(t);
		t1.start();
		for(int count=0;count<=10;++count) {
			try {
			System.out.println("Main Thread: "+(Thread2.count));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Exception in Thread: "+e.getMessage());
			}
		}
		System.out.println("Main Thread Ends");
		
	}

	

}
