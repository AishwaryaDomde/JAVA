package Interface;
interface A{
	void show();
}
interface B{
	void show();
}
public class chceckInterfc implements A,B{
	public void show() {
		System.out.println("hii");
	}
	public static void main(String args[]) {
		chceckInterfc c= new chceckInterfc();
		c.show();
	}
	
}
