package Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountNumbersMap {
		public static void main(String args[]) {
			Integer arr[]= {1,2,1,3,4,2,1,3};			
			ArrayList<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));			
			HashMap<Integer,Integer> hashmap = new HashMap<Integer, Integer>();
			for(int i:arrlist) {
				Integer c= hashmap.get(i);
				System.out.println(i);
				hashmap.put(i,  (c == null) ? 1 : c + 1);
			}
			System.out.println(hashmap);
		}
}
