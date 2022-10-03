package week2;

public class Diamondproblem implements Diamond1,Diamond2 {
	
	@Override
	public void show() {
		Diamond1.super.show();
		Diamond2.super.show();
	}
public static void main(String[] args) {
	Diamondproblem tc = new Diamondproblem();
		tc.show();
}
}

