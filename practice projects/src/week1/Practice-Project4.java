package week1;
//default constructor
class studentdetails{
	int id;
	String name;
	String course;
	void display(){
		System.out.println(id+" "+name+" "+course);
	}
}
//parameterized constructor
class empdetails{
	int id;
	String name;
	String project;
	empdetails(int i,String n,String p){
		id=i;
		name=n;
		project=p;
	}
	void dispaly() {
		System.out.println(id+" "+name+" "+project);
	}
}
public class Constructors {
public static void main(String[] args) {
	studentdetails std1 =new studentdetails();
	studentdetails std2 =new studentdetails();
	std1.display();
	std2.display();
	empdetails emp1=new empdetails(1,"sam","car");
	empdetails emp2=new empdetails(2,"dean","bike");
	emp1.dispaly();
	emp2.dispaly();
}
}
