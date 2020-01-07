package Abstract;
abstract class demo1 {
	abstract void funDemo(String name);
}
class DemoImp extends demo1{
	void funDemo(String name){
		System.out.println("=="+name);
	}
}
public class Abstract02 {
  public static void main(String args[]) {
	  DemoImp d= new DemoImp();
	  d.funDemo("Kajal");
  }
}
