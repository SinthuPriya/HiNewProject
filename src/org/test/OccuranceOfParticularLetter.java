package org.test;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfParticularLetter {

	public static void main(String[] args) {

		String str = "Sinthuja";
		
		Map <Character,Integer> mp = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			if(mp.containsKey(c)){
				
			Integer count = mp.get(c);
			
			mp.put(c, count+1);
			
				
			}
			
			else
			{
				mp.put(c, 1);
			}
			
			
		}
		System.out.println(mp);
	
	}

}
