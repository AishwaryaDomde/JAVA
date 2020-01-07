package Wrappers;

public class AutoBoxing {
	public static void main(String arg[]) {
		int a=10;
		Integer b= Integer.valueOf(a); // Autoboxing 
		Integer c=a;
		System.out.println(a+":"+b+":"+c);
	}
}
