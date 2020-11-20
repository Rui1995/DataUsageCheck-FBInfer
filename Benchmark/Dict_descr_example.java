import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
class Dict_descr_example {				
	HashMap <String, Integer>  test1 ( ){			
		HashSet<String> important = new HashSet<String>();
		important.add("Albert Einstein");
		important.add("Alan Turing");
		HashMap <String, String> texts = new HashMap <String, String>(); //como input??
		Scanner in = new Scanner(System.in);  //untested scanner
		while (in.hasNext()) {
	        String input1 = in.next();
	        String input2 = in.next();
	        texts.put(input1, input2);
    	}
		HashMap <String, Integer> freqdict = new HashMap <String, Integer>(); //como input??
		Scanner in2 = new Scanner(System.in);  //untested scanner        DONT KNOW IF 2 SCANNERS IN A ROW WORKS
		while (in2.hasNext()) {
	        String input1 = in2.next();
	        int input2 = in2.nextInt();
	        freqdict.put(input1, input2);
    	}
    	for (String a : texts.keySet()){
    		String b = texts.get(a); 
    		if (important.contains(a)){  
				int weight = 2; 
			}
			else {
				int weight = 1;
				String[] words = a.split(" "); 				
				for (String word : words){
					word = word.toLowerCase(); 
					freqdict.put(word, (freqdict.get(word)+weight) );
				}
			}
    	}
/*
		texts.forEach((a,b) -> {
			if (important.contains(a)){  
				int weight = 2; 
			}
			else {
				int weight = 1;
				String[] words = a.split(" "); 				
				for (String word : words){
					word = word.toLowerCase(); 
					freqdict.put(word, (freqdict.get(word)+weight) );
				}
			}		
		});*/
		return freqdict;			
	}
}