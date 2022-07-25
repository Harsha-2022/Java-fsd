package week2;

public class Dog extends Animal1 {
	public void eat() {
		super.eat();
		System.out.println("I can eat dog food");
	}
	public void bark() {
		System.out.println("I can bark");
	}
	public void smell() {
		System.out.println("I can smell the thief");
	}

}
