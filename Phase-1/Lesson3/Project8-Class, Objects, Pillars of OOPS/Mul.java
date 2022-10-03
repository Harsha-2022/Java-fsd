package week2;

public class Mul {
	public int Mul(int x,int y) {
		return(x*y);
	}
	public int Mul(int x,int y,int z) {
		return(x*y*z);
	}
	public double Mul(double x,double y) {
		return(x*y);
	}
	public static void main(String[] args) {
		Mul m = new Mul();
		System.out.println(m.Mul(2, 3));
		System.out.println(m.Mul(2, 3, 4));
		System.out.println(m.Mul(2.3,2.5));
	}

}
