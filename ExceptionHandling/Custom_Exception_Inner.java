package ExceptionHandling;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class MyExpException extends Exception{
	String Flower;
	public MyExpException(String flowerName) {
		Flower = flowerName;
	}
	public String toString() {
		String Result = Flower +"Not Present..You are Unlucky! Try Again!!..";
		return Flower;		
	}
}
class Custom_Exception_Inner {
	private static Scanner scanVal;
	public static void isValidFlower(String FlowerName) throws MyExpException{
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Plumeria","Lotus","Tuberose","Hibiscus","Jasmin","Daffodils","Rose"));
		if(arr.contains(FlowerName)) {
			System.out.println("Present in List");			
		}else {
			throw new MyExpException(FlowerName);
		}
	}
	public static void main(String[] args) {
		scanVal = new Scanner(System.in);
		System.out.println("Enter Flower Name:");
		String Name = scanVal.nextLine();
		try {
			isValidFlower(Name);
		} catch (MyExpException e) {
			e.printStackTrace();
		}
	}
}
