package ExceptionHandling;

public class throw1 {
	public static void main(String arg[]) {
		try {
			throw new NullPointerException();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
