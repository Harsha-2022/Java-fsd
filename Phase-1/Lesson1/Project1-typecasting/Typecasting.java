package week1;
public class Typecasting {

	public static void main(String[] args) {
		System.out.println("the implicit typecastings are ");
          byte a= 2;
          System.out.println("value of byte is "+a);
          int b = a;
          System.out.println("b value = "+b);
          char c = 'b';
          System.out.println("c value = "+c);
          int d = c;
          System.out.println("d value = "+d);
          float e = d;
          System.out.println("e value = "+e);
          double f = e;
          System.out.println("f value = "+f);
          System.out.println("the explicit typecastings are");
          float g = (float) 12.2;
          System.out.println("value of float is "+g);
          int h = (int)g;
          System.out.println("h value = "+h);
	}

}
