package week1;
public class Arrays {

	public static void main(String[] args) {
        System.out.println("single dimensional array");
        int a[]= {12,13,14,15,16};
        int b[][]= {{1,2,3,4},{5,6,7,8}};
        for(int i=0;i<5;i++) {
        	System.out.println("array elements are "+a[i]);
        }
           System.out.println(" ");
           System.out.println("multidimensional array");
	       System.out.println("arr[0][0]= "+b[0][0]);
	       System.out.println("arr[0][1]= "+b[0][1]);
	       System.out.println("arr[1][1]= "+b[1][1]);
	       System.out.println("arr[1][3]= "+b[1][3]);
	    }
	  
	}
