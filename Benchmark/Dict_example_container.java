import java.util.HashMap;
class Dict_example_container {				
	int test1 (int value){
		HashMap <String, Integer> example = new HashMap <String, Integer>();
		example.put ("a", 0);
		example.put ("b", 1);
		example.put ("c", 2);
		String key = "b";
		example.put (key, value);
		int i = example.get("a");
		return i;
	}
}
