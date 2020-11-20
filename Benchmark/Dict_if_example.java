import java.util.HashMap;
class Dict_if_example {				
	Boolean test1 (String key){
		HashMap <String, Integer> example = new HashMap <String, Integer>();
		example.put("a", 0);
		example.put("b", 1);
		example.put("c", 2);
		int tresh = 1;
		Boolean ret = false; 
		if ((example.get(key)) > tresh){
			ret= true;
		}
		else {
			ret=false;
		}
		return ret;		 
	}
}