package week1;
class daspecifier
{
	void display() {
		System.out.println("it is default access specifier");
	}
}
class paspecifier{
	private void display() {
		System.out.println("it is private access specifier");
	}
}
class pubaccessspecifier{
	public void display() {
		System.out.println("it is public access specifier");
	}
}
class proaccessspecifier{
	protected void display() {
		System.out.println("it is protected access specifier");
	}
}
public class AccessModifiers extends proaccessspecifier{

	public static void main(String[] args) {
		//default access specifier
           daspecifier b=new daspecifier();
           b.display();
           //private access specifier
           paspecifier c =new paspecifier();
           //accessing private method of another class not possible
           // c.display();
           //public access specifier
            pubaccessspecifier d=new pubaccessspecifier();
            d.display();
            //protected access specifier
            proaccessspecifier e = new proaccessspecifier();
            e.display();
            
	}

}
