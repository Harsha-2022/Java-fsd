package week2;

public class TestEncapsulation {
	public static void main(String[] args) {
		Encapsulate A =new Encapsulate();
		A.setName("Lion king");
		A.setType("Wild");
		A.setWeight(250);
		A.setAge(8);
		System.out.println("My name is "+A.getName());
		System.out.println("My type is "+A.getType());
		System.out.println("My Weight is "+A.getWeight()+" Kgs");
		System.out.println("My Age is "+A.getAge());
	}

}
