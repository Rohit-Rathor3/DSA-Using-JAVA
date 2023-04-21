/* Two strings are said to be anagrams if they make a meaningful word by rearranging or shuffling the letters of the string. 
 * In other words, we can say that two strings are anagrams if they contain the same characters but in a different order.*/


package string.logics;

public class AnagramString {

	// let make method to check is anagra, or not
	public static boolean isAnagram(String s1, String s2) {
		
		int count[]= new int[256];
		for(int i=0;i<s1.length();i++) {
			count[s1.charAt(i)]++;
			int k = s1.charAt(i);
			System.out.println(k);
			count[s2.charAt(i)]--;
		}
		for(int j=0;j<s1.length();j++) {
			if(count[j]!=0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s1="earth";
		String s2="heart";
		if(isAnagram(s1,s2))
			System.out.println("Strings are Anagrams");
		else
			System.out.println("Strings are not Anagram");
	}
}
