abstract class Main {
	abstract void  Sum(int a,int b);
}
class Result1 extends Main{
	void Sum(int a,int b) {
		System.out.println(a*b);
	}
}
public class Abstract2 {
	public static void main(String args[]) {
		Result1 r1= new Result1();
		r1.Sum(15,2);
	}
}
