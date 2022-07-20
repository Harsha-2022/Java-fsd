package project1;
 
public class Methods {
	
//normal method	
int add(int a,int b) {
	int c=a+b;
	return c;
}

//call by value method
int value=20;
int cal(int value) {
    return value = value*10/100;
}

//call by reference
int val =10;
void operation(Methods m) {
	m.val =val+100;
}


//method overloading
void area(int c,int d) {
	System.out.println("rectangle area is "+(c*d));
}
void area(int c) {
	System.out.println("area of circle is "+(3.14*c*c));
}
public static void main(String[] args) {
	Methods m =new Methods();
	int res =m.add(12,13);
	System.out.println("the result for normal method is "+res+"\n");
	System.out.println("the call by value method");
	System.out.println("before calculation: "+m.value);
	m.cal(100);
	System.out.println("after calculation: "+m.value+"\n");
	System.out.println("the method overloading");
	m.area(12,13);
	m.area(4);
	System.out.println("\n");
	System.out.println("the call by reference");
	System.out.println("before operation: "+m.val);
	m.operation(m);
	System.out.println("after calculation: "+m.val);
	
}
}
