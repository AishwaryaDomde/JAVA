package ExceptionHandling;

public class TryCatchFinal {
	public static void main(String args[]) {
		try {
			int i=0;
			int sum=0;
			sum= 10/i;
			System.out.println(sum);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("It Exception");
		}
	}
}
