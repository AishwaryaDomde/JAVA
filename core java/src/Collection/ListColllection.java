package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListColllection {
	public static void main(String args[]) {
		int aa[]={14,4,5,1,1,3,4,8,9,1,7,5,6,7,6};
		Integer a[] = {14,4,5,1,1,3,4,8,9,1,7,5,6,7,6};
		List<Integer> list = Arrays.asList(a);
		List<Integer> linklist =  new LinkedList<>(Arrays.asList(a));
		List <Integer> arraylist = new ArrayList<>(Arrays.asList(a));
		List<Integer> vector = new Vector(Arrays.asList(a));
		List<Integer> stack = new Vector(Arrays.asList(a));
		System.out.println("stack:\t\t"+stack);
		System.out.println("ArrayList:\t"+arraylist);
		System.out.println("Vector:\t\t"+vector);
		System.out.println("List:\t\t"+list);
		System.out.println("Link List:\t"+linklist);
		/***************Add data****************/
		linklist.add(5);
		arraylist.add(6);
		vector.add(5);
		stack.add(2);
		System.out.println("After Adding List:"+list);
		System.out.println("After Adding Link List:"+linklist);
		System.out.println("After Adding ArrayList:"+arraylist);
		System.out.println("After Adding Vector:"+vector);
		System.out.println("After Adding stack:"+stack);
		for(int tempi:linklist) {
			linklist.add(7771);
		}
		System.out.println(linklist);
	}
}
