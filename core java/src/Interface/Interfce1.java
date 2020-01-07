package Interface;
interface Base{
	 void deatils();
}
class SubInte_1 implements Base{
	@Override
	public void deatils() {
		// TODO Auto-generated method stub
		System.out.println("Implementing interface");
	}
}
public class Interfce1 {
	public static void main(String args[]) {
		SubInte_1 inte_1= new SubInte_1();
		inte_1.deatils();
	}
}
