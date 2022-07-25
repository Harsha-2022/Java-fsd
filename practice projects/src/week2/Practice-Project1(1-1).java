package week2;

//Creating Thread by extending the Thread class
public class Thread1 extends Thread {
	public void run() {
		System.out.println("Concurrent Thread started running");
	}

	public static void main(String[] args) {
		Thread1 t =new Thread1();
		t.start();
	}

}
