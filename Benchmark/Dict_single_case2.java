class Dict_single_case {				//we dont specify the array size, probably affects the analysis runtime
	int[] test1 ( ){
		int v1 = 0;
		int[] d = new int[5];
		int a = 1;
		d[a] = v1;
		return d;
	}
}
