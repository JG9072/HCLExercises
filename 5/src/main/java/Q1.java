import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q1 {


	
	public static void main(String[] args) {
		
		//returns the index of the 1st char that is of highest occurance 
		System.out.println(maxCharacter("test"));
		
		
	}//end of main
	
	
	public static int maxCharacter(String s){
		
		//1. count how many of each char there is
			TreeMap<String, Integer> charMap = new TreeMap();

			//initialize the chars at 0 to make it easier to increment
			for(int index = 0; index < s.length(); index++) {
				charMap.put(""+s.charAt(index),0);
	        }
			
			//loop through each char and increment the count each time a duplicate char is found
			for(int index = 0; index < s.length(); index++) {
				
				//increments count of a duplicate char
				if(charMap.containsKey(""+s.charAt(index) )  ) {
					int counter = ((Integer) charMap.get(""+s.charAt(index))).intValue();
					Integer Integer1 = Integer.valueOf(++counter);
					charMap.put(""+s.charAt(index), Integer1);		
				}
					
					
	        }		
			//Prints out the HashMap, used for testing previous code.
			//System.out.println(charMap);
			
			
			
		//2. get the highest occurring char
	        int highestVal = 0;
	        String highestKey = "";
	        for (Map.Entry<String, Integer> entry : charMap.entrySet()) {
	        	
	            if(entry.getValue() > highestVal) {
	            	highestVal = entry.getValue();
	            	highestKey = entry.getKey();
	            }
	            
	        }
	        
	        //Used to test that the highest Val,Key Pair is chosen
	        //System.out.println("The Highest is:"+highestVal+""+ highestKey);
			
	        
		//3. get the index of the first occurrance of such a char
        for(int index = 0; index < s.length(); index++) {
        	
        	if(highestKey.charAt(0) == s.charAt(index)) {
        		return index;
        	}
       
        }
		
		
		
		
		return -1;		//indicates an error occured
		
	}//end of maxCharacter()
	
	
	
	
}//end of Q1 class
