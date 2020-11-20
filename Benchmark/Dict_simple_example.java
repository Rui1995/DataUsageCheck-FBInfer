import java.util.HashMap;
class Dict_simple_example {
	int test1 (int value){
		HashMap <String, Integer> example = new HashMap <String, Integer>();
		example.put ("a", 0);
		example.put ("b", 1);
		example.put ("c", 2);
		example.put("a", value);
		int i = example.get("a");
		return i;
	}
}