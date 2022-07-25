package week2;

public class TestAbstraction {

	public static void main(String[] args) {
		Shape s1=new Circle("Blue",3);
		Shape s2=new Rectangle("Green",2,3);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
