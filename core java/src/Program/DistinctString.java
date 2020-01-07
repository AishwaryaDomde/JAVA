package Program;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DistinctString {

	public static Set<String> distinctSubstring(String str) {
		Set<String> result = new HashSet<String>();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				result.add(str.substring(i, j));
			}
		}
		Set<String> hashSetToTreeSet = new TreeSet<String>();
		hashSetToTreeSet.addAll(result);
		return hashSetToTreeSet;
	}
	public static void main(String[] args) {
		String str = "ababa";
		Set<String> subs = distinctSubstring(str);

		System.out.println("Distinct Substrings are: ");
		for (String s : subs) {
			System.out.println(s);
		}
	}
}