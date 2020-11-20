import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
class BRCA_example {				
	HashMap <String, String> test1 ( ){
		HashMap <String, Integer> col_indices = new HashMap <String, Integer>();  //input
		Scanner in = new Scanner(System.in);  //untested scanner
		while (in.hasNext()) {
	        String input1 = in.next();
	        int input2 = in.nextInt();
	        col_indices.put(input1, input2);
    	}
		ArrayList<String> items = new ArrayList<String>();
		Scanner in2 = new Scanner(System.in);
		while (in2.hasNext()) {
    		String input3 = in.next();
    		items.add(input3);
		}
		HashMap <String, String> bx_ids = new HashMap <String, String>();
		for (String key : col_indices.keySet()){
			bx_ids.put (key, items.get((col_indices.get(key))));
		}
		return  (bx_ids);  
	}
}
