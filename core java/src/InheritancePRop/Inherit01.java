package InheritancePRop;

class Sub01{
	public void show() {
		System.out.println("In Sub01");
	}
}
class Sub02 extends Sub01{
	public void show() {
		System.out.println("In Sub02");
	}
}
public class Inherit01 {
	public static void main(String args[]) {
		Sub01 t1 = new Sub02();
		Sub01 t2 = new Sub01();
		t1.show();
		t2.show();
	}
}
