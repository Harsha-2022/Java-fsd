package week1;
public class Innerclass1 {
	//inner class type1
	private String message="hello sam";
	class Inner{
		void hello() {
			System.out.println(message+" iam dean winchester");
		}
	}
	
	//Inner class type2
	private String msg ="hi cass it's me sam winchester";
	void display() {
		class Innerclass{
			void msg() {
				System.out.println(msg);
			}
		}
		Innerclass i = new Innerclass();
		i.msg();
	}
	
	public static void main(String[] args) {
		Innerclass1 ic =new Innerclass1();
		Innerclass1.Inner ic1=ic.new Inner();
		ic1.hello();
		
		//calling second inner class
		ic.display();
		
	}

}

