package week2;

public class Customdemo extends Exception {
	public Customdemo(String s) {
		super(s);
	}

	public static void main(String[] args) {
		try {
			throw new Customdemo("temp");
		}catch(Customdemo e) {
			System.out.println("caught\n"+ e.getMessage());
			
		}
	}

}
