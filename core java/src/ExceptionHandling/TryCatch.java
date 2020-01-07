package ExceptionHandling;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int i=0;
			int sum=0;
			sum= 10/i;
			System.out.println(sum);
		}catch(Exception e) {
			e.printStackTrace();
			e.hashCode();
		}
	}
}
