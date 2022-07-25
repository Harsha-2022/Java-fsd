package week2;

public class Throws {
	void Typecasting() {
	String s ="ram";
	int a =Integer.parseInt(s);
	System.out.println("output is: "+ a);
	}
	public static void main(String[] args) {
		Throws t =new Throws();
		try {
			t.Typecasting();
		}catch(NumberFormatException e) {
			System.out.println("\nError: "+e.getMessage());
		}
		System.out.println("\nEnd of the line");
		
	}
}

