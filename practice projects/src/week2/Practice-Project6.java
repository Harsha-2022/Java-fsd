package week2;
class Exception1 extends Exception{
	String a;
	Exception1(String b){
		a=b;
	}
	public String toString() {
		return("Exception1 occurred: "+a);
	}
}
public class Exceptionhandling {

	public static void main(String[] args) {
		try {
		System.out.println("Try block started");
		//throwing custom exception using throw
		throw new Exception1("This is my error msg");
		}catch(Exception1 e) {
			System.out.println("Entered into the catch block\n"+e);
		}

}
}
