// Here, we will find first non repeating letter in stream of string.
package com.queue.problems;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonReaptitngLetter {

	public static void printNonRepeating(String str) {
		Queue<Character> q = new LinkedList<>();
		int freq[] = new int[26];
		
		for(int i=0 ; i<str.length();i++) {
			char  ch = str.charAt(i);
			q.add(ch);
			freq[ch-'a']++;
		
			 while(!q.isEmpty() && freq[q.peek()-'a']>1) {
				 q.remove();
			 }
		}
		
		if(q.isEmpty())
			System.out.println(-1);
		else
			System.out.println(q.peek());
	}
	
	
	public static void main(String[] args) {
		String str = "aabbccddef";
		printNonRepeating(str);
	}
}
