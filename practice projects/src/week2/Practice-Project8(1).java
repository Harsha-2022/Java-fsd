package week2;

public class Animal {
	String name;
	String type;
	int weight;
	int age;
	public Animal(String name,String type,int weight,int age) {
		this.name=name;
		this.type=type;
		this.weight=weight;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getWeight() {
		return weight;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return ("Animal name is "+this.getName()+"\nit's type,weight and age are "+this.getType()+","+this.getWeight()+","+this.getAge());
		
	}

	public static void main(String[] args) {
		Animal A =new Animal("Lion","Wild",230,8);
		System.out.println(A.toString());
	}

}
