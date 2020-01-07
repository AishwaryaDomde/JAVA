package Interface;

interface base01 {
	static void show() {	//these methods cannot be overridden or changed in the implementation class.
		System.out.println("base01");
	}
}
interface base02 {
	static void show() {	//these methods cannot be overridden or changed in the implementation class.
		System.out.println("base02");
	};
}
public class Interfc2Intrfc implements base02, base01 {
	public static void show() {
		System.out.println("main b");
	}
	public static void main(String args[]) {
		System.out.println("main");
		show();
		base01.show();
		base02.show();
	}
}
//If use non static method then it wouldn't possible to implenment , It show errors
//but if we use static method with main class method then non of interface get call 
//if we directly call interface then it works 