import java.util.HashMap;
class Larger_expressions {				
	void test1 (int inp){
		if (inp>=5 && inp<=8){
			HashMap <Integer, Integer> d1 = new HashMap <Integer, Integer>();
			d1.put (2, 2);
			d1.put (5, 10);
			d1.put (3, 8);
			HashMap <Integer, Integer> d2 = new HashMap <Integer, Integer>();
			int v1 = (4+ 5);
			int v2 = (d1.get(3) *2 - d1.get(5));
			d1.put(v1, (v2 * d1.get(2)) );
			if (d1.get(v1)>(inp + 5)){
				v1 = v1; //??
				for (int v : (d1.values())){
					v1 = v1; //??
					if (v<=v2) {
						if (d2.containsKey(inp)){
							if(d2.get(inp)<=100){
								d2.put(inp, d2.get(inp) + v);

							}
						}
						else{
							d2.put(inp, v);
						}
					}
					else {
						d2.put (-1, v);
					}
				}
			}
		}
	return ;
	}
}
