// We will find the first non repeating character in a string.
package string.logics;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NonReapitingCharacter {
	
	public static void main(String[] args) {
		String s= "aabbccdef";
		LinkedHashMap<Character,Integer> hm= new LinkedHashMap<>();
		//change the string into array and put them in LinkedHashset
		for(char ch: s.toCharArray()) {
			hm.put(ch, hm.containsKey(ch)?hm.get(ch)+1:1);
				
		}
		for(Entry<Character,Integer> entry :hm.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
			
		}
	}

}
