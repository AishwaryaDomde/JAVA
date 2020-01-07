interface Office{
	String Name = "Head Quarter";
	String ShowName();
}
class Branch implements Office{
	public String  ShowName() {
		String Name=Office.Name;
		return Name;		
	}
}
public class Interface1 {
	public static void main(String[] args) {
		Branch b1= new Branch();
		System.out.println(b1.Name);
	}
}
