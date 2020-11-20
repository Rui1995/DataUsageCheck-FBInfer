import java.util.HashMap;
import java.util.Scanner;
class Running_example {				
	int test1 ( ){			
		HashMap <Integer, Integer> scores = new HashMap <Integer, Integer>();			//input 
		Scanner in = new Scanner(System.in);  //untested scanner
		while (in.hasNext()) {
	        int input1 = in.nextInt();
	        int input2 = in.nextInt();
	        scores.put(input1, input2);
    	}
		HashMap <Integer, Integer> score_ocurrences = new HashMap <Integer, Integer>();
		int weight = 0;
		for (int a : scores.keySet()){
			int b = scores.get(a);
			if (a<100) {weight = 3;}
			else weight = 1; 
			if (score_ocurrences.containsKey(a)){
				score_ocurrences.put (a, 0);
			}
			score_ocurrences.put (a, (score_ocurrences.get(a)+weight));
			
		}
		int scores_gt_10 = 0;
		for (int k : score_ocurrences.keySet()){
			if (k>10){
				scores_gt_10 += score_ocurrences.get(k);
			}	
		}
		return scores_gt_10;
	}
}