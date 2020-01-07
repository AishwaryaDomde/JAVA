package Wrappers;

import java.util.Scanner;

public class FabonicciSeries {

	static int m1=0, m2=1,m3=0;
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of fabonicci series");
		int val = scan.nextInt();
		System.out.print(m1+" "+m2);
		FabonicciSeries(val-1);
	}

	
	static void FabonicciSeries(int val) {
		if(val>0) {
			m3=m1+m2;
			m1=m2;
			m2=m3;
			System.out.print(" "+m3);
			FabonicciSeries(val-1);
		}
		
	}

}
