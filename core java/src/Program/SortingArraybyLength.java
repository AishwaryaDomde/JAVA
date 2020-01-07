package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingArraybyLength {
	
	public static void Sort(String[] list) {
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList(list));
		newList.sort(Comparator.comparing(String::length));
		System.out.println("After1"+newList);
	}
	public static void SortArrayList(ArrayList<String> userArr) {
		ArrayList<String> newList = userArr;
		newList.sort(Comparator.comparing(String::length));
		System.out.println("After"+newList);
	}
	public static void main(String args[]) {
		String list[] = {"GeeksforGeeeks", "I", "from", "am"};
		Sort(list);
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter You array Items Length");
		int ArrLength= sc.nextInt();
		System.out.println("Enter You array Items");
		ArrayList<String> userArr = new ArrayList<>();
		for(int i=0;i<ArrLength;i++) {
			userArr.add(sc.next());			
		}
		System.out.println("Before"+userArr);
		SortArrayList(userArr);
	}
}
