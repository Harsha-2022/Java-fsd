package week2;

public class FinallyDemo {

	public static void main(String[] args) {
		int a = 70,b=0,res= 0;
		try {
	    	res=a/b;
			
		}catch(ArithmeticException e) {
			System.out.println("\nError: "+e.getMessage());
		}
		finally {
		System.out.println("\nThe result is: "+res);
		
	}

}
}
