package string.logics;
import java.util.HashSet;
import java.util.Set;

public class FindLongestSubstring {

	public static void main(String[] args) {
		String str="abcabcdabcdeabcdef";  // longest is --> abcda
		HashSet<Character> set=new HashSet<>();
		String longestTillNow="";
		String longestOverAll="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(set.contains(ch)) {
				longestTillNow="";
				set.clear();
			}
			set.add(ch);
			longestTillNow+=ch;
			
			if(longestTillNow.length()>longestOverAll.length())
				longestOverAll=longestTillNow;
		}
		System.out.println("Longest String in "+str+" is ==> "+longestOverAll);
		
		
	}
}
