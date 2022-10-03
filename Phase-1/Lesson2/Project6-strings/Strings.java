package week1;
public class Strings {

	public static void main(String[] args) {
		 System.out.println("Methods of strings");
         String s1="Hello World";
         System.out.println("length is "+s1.length());
         String s2=new String("Hello SAM");
         System.out.println(s2.substring(6));
         //String comparison
         System.out.println(s1.compareTo(s2));
         //toLowercase
         System.out.println(s2.toLowerCase());
         //toUppercase
         System.out.println(s2.toUpperCase());
         //equals
         System.out.println(s1.equals(s2));
         //isEmpty
         System.out.println(s2.isEmpty());
         //replace
         System.out.println(s2.replace('e','a' ));
         System.out.println("\n");
         System.out.println("creating StringBuffer");
         //StringBuffer
         StringBuffer sb =new StringBuffer("Hello World");
         System.out.println("string is:"+sb);
         sb.insert(1,'a');
         System.out.println("after inserting: "+sb);
         sb.delete(0, 1);
         System.out.println("after deleting: "+sb);
         sb.replace(0,1,"hell");
         System.out.println("after replace: "+sb);
         System.out.println("\n");
         System.out.println("creating StringBuilder");
         //StringBuilder
         StringBuilder sb1 = new StringBuilder("call me");
         sb1.append(" sammy ");
         System.out.println(sb1);
         System.out.println(sb1.insert(13,"iam dean"));
         System.out.println(sb1.delete(1, 2));
         System.out.println(sb1.reverse());
         System.out.println("\n");
         System.out.println("conversions");
         //Conversions
         String s="Sam";
         StringBuffer sbr=new StringBuffer(s);
         sbr.reverse();
         System.out.println("string to StringBuffer");
         System.out.println(sbr);
         StringBuilder sbr1 =new StringBuilder(s);
         sbr1.append("winchester");
         System.out.println("String to StringBuilder");
         System.out.println(sbr1);
	}
}