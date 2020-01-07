package Abstract;
import org.apache.commons.lang.math.NumberUtils;
abstract class Check{
	abstract void IsNumber1(); 
}
class DocheckOperation extends Check{
	String getData="";
	public void Data(String S) {
		getData = S;
	}
	void IsNumber1() {
			System.out.println(getData+" is =>"+(NumberUtils.isNumber(getData)?"Number":"String"));
	}
}
public class AbstractTryCatch {
	public static void main(String args[]) {
		DocheckOperation d1= new DocheckOperation();
		d1.Data("hello");
		d1.IsNumber1();
		d1.Data("123");
		d1.IsNumber1();
	}
}
