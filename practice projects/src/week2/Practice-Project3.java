package week2;

class Sender{
	public void send(String msg) {
		System.out.println(msg+"\tSending....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n"+ msg+"\tsent....");
	}
}
class Displaymsg extends Thread{
	private String msg;
	Sender sender;
	Displaymsg(String m, Sender s){
		msg=m;
	    sender=s;
	}
	public void run(){
		synchronized(sender){
			sender.send(msg);
		}
	}

}
public class Synchronisation {

	public static void main(String[] args) {
		Sender s =new Sender();
		Displaymsg d1 =new Displaymsg("Hi sam",s);
		Displaymsg d2 =new Displaymsg("Iam dean call me",s);
		d1.start();
		d2.start();
		try {
			d1.join();
			d2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
