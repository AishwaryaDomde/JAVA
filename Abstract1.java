abstract class Base {
	abstract void Display();
}
class Derived extends Base {
	void Display(){
		System.out.println("In Derived One ");
	}
}
public class Abstract1 {
	public static void main(String []args) {
		Base b1 =new Derived();
		( b1).Display();
	}
}
