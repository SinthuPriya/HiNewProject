package org.test;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfParticularWord {

	public static void main(String[] args) {

		String str = "Sinthuja is very good";
		
		Map <String,Integer> mp = new HashMap<>();
		
		String[] sp = str.split(" ");
		
		for(String c:sp) {
			
			if(mp.containsKey(c)) {
				
				Integer count  = mp.get(c);
				
				mp.put(c, count+1);
				
			}
			else
			{
				mp.put(c, 1);
			}
			
		}
		
		
	}

}
