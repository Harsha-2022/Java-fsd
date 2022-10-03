package week2;

public class Trycatch {

	public static void main(String[] args) {
		String s ="ram";
		try {
		int a =Integer.parseInt(s);
		System.out.println("output is: "+ a);
	}catch(NumberFormatException e) {
		System.out.println("NumberFormatException is occured..");
	}
		System.out.println("logic after exception.....");
}
}
