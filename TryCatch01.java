
public class TryCatch01 {
	public static void main(String[] args) {
		try {
			int i=0/0;
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		finally {
			System.out.println("Finally");
		}
	}
}
