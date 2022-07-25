package week2;

public class Throw {

	public static void main(String[] args) {
		int a = 70,b=0,res;
		try {
			if(b==0)
				throw(new ArithmeticException("can't divide by zero..."));
			else
				res=a/b;
			System.out.println("\n\tThe result is: "+res);
		}catch(ArithmeticException e) {
			System.out.println("\nError: "+e.getMessage());
		}
		System.out.println("\nEnd of the line");
		
	}

}
