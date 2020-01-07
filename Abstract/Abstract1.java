package Abstract;
abstract class Sum {
	 abstract void SumDisplay();
}
class DoSum extends Sum{
	int Sum=0;
	void DoSum(int a,int b) {
		Sum=a+b;
	}
	void SumDisplay() {
		System.out.println(Sum);
	}
}
public class Abstract1 {
	public static void main(String args[]) {
	DoSum d=new DoSum();
		d.DoSum(4,5);
		d.SumDisplay();
	}
}