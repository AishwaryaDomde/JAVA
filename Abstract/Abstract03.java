package Abstract;
abstract class Fun{
	void Goa() {
		
	}
}
public class Abstract03 extends Fun{
	void Goa() {
		System.out.println("Lets Have fun in Goa in Abstract03");
	}
	public static void main (String arg[]) {
		Fun F= new Fun() {}; 
		F.hashCode();
		Abstract03 F1= new Abstract03() ;
		F1.Goa();
	}
}
