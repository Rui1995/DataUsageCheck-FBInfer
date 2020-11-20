import java.util.HashMap;
class Three_dict_example {				
	void test1 (int i, int value){
		int v = 8;
		HashMap <Integer, Integer> dict_in = new HashMap <Integer, Integer>();
		HashMap <Integer, Integer> dict_out = new HashMap <Integer, Integer>();
		HashMap <Integer, Integer> dict_own = new HashMap <Integer, Integer>();	
		for(int key=0; key>=0 && key<(v+1); v++){
			if (value>=(-3)  && value<= 3){
				dict_in.put (key, value);
			}	
		}
		dict_own.put(v, (-1));
		if (i>=2 && i<=5){
			dict_own.put(i, 0);
		}
		for (int k : dict_own.keySet()){
			dict_out.put(k, (dict_in.get(k)+dict_own.get(k)));
		}
		for (int k: dict_out.keySet()){
			int v1 = dict_out.get(k);
			if(k>=3) {System.out.println(v1);}
		}

		/*dict_out.forEach((k,v1) -> {
			if(k>=3) {System.out.println(v1);}		//print in this case. return void
		});*/
	return;				
	}
}