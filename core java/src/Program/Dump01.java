package Program;

import java.util.ArrayList;
import java.util.Arrays;

public class Dump01 {
	public static void main(String arg[]) {
		String arr = "ababa";
		char[] arr1=arr.toCharArray();
		
		for(int i=0;i<arr.length();i++) {
			System.out.println(arr1[i]);
		}
		String arr3[] = {"hii","stud","bank","testing"};
		ArrayList<String> arrlist1= new ArrayList<String>(Arrays.asList(arr3));
		System.out.println(arrlist1);
	}
}
