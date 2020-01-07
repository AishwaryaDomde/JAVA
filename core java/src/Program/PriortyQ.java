package Program;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriortyQ {
	public static void main(String xys[] ){
		PriorityQueue<String> PriQ= new PriorityQueue<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Length:");
		int lngth= sc.nextInt();
		System.out.println("Strings:");
		for(int i=0;i<lngth;i++) {
			PriQ.add(sc.next());
		}
		System.out.println(PriQ);
	}
}
