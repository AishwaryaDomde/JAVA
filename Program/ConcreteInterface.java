package Program;

interface  A{
	static int product(int a, int b) {
		return a * b;
	}
}
public class ConcreteInterface implements A{
		// main method
	public static void main(String args[]) {
		int p = A.product(5, 10);
		// print product
		System.out.println("Product: " + p);

	}
}
