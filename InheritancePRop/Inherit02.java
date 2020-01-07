package InheritancePRop;

/****Final methods cannot be overridden.***************/

class Base{
	public static void Show(int a) {
		System.out.println("Value for a:"+a);
	}
}
class Level2 extends Base{
	public static void Show(int b) {
		System.out.println("Value for b:"+b);
	}
}

/******Runtime Polymorphisum not happen with static method*********/
public class Inherit02 {
	public static void main(String args[]) {
		Base b1= new Level2();
		b1.Show(12);
		Base b2 = new Base();
		b2.Show(50);
	}
}