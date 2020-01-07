import java.io.IOException;

class Error01{
	public int Check() throws IOException{

		System.out.println("Does it Work..");
		int i = 5/2;
		return i;
	}
}
public class ExceptionHandling_throws {
	public static void main(String[] args) throws IOException {
		Error01 chck= new Error01();
		chck.Check();
		System.out.println("Is it Work..");
	}
}
