package ExceptionHandling;

public class less10Exception extends Exception {
	int UrNum; 
	public less10Exception(int a) {
		UrNum =a;
	}

	public String toString() {
		String result = "Your Nuber is less than 10 that is:"+UrNum;
		return result;
	}
}
