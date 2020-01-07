package ExceptionHandling;

import java.util.Scanner;

public class CustomExp03 extends Exception{
	public static void isLess(int a) throws less10Exception  {
		if(a<=10) {
			throw new less10Exception(a);
		}
	}
	public static void main(String arg[]) throws less10Exception {
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter your number:\n");
		int yourNum = scan.nextInt();
		isLess(yourNum);
	}
}
