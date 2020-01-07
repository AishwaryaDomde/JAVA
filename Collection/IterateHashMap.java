package Collection;
import java.util.HashMap;
import java.util.Map;
public class IterateHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "value1");
		map.put(2, "value2");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}