class Parent{
	public void display() {
		System.out.println("In Parent");
	}
}
class Child extends Parent{
	public void display1() {
		System.out.println("In Child....");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.display1();

	}

}
