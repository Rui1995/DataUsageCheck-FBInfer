import java.util.Arrays;
class Dict_example {				//we dont specify the array size, probably affects the analysis runtime
	void test1 (int i){
		int v1 = 0;
		int[] d = new int[5]; //not sure if array or hashmap. but cant access d[1] with hashmap
		d[4] = 1;
		d[v1] = 7;
		d[1] = v1;
		int v2 = d[3];
		d[2] = 3 + v2;
		if (i>=2){
			//i1 =i; //i = i ??
			if (Arrays.asList(d).contains(i)){    //from stackoverflow
				v2 = d[i];
			}
			int k;
			for (k = 0; k < d.length; k++){
				int v= d[k];
				if (k>=3){
					d[k-2] = v;
				}
			}
		}
	return ;
	}
}
