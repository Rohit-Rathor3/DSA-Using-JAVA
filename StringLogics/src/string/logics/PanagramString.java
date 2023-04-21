// A pangram string contain all alphabates. a to z.
package string.logics;

public class PanagramString {

	public static void main(String[] args) {
		String str="the quick brown fox jumps over the lazy dog";
		boolean flag=false;
		if(str.length()<26)
			System.out.println("The given string is not panagram");
		for(char ch='a';ch<='z';ch++) {
			if(str.indexOf(ch)<0) {
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("Given String is a Pangaram");
		}
		else
			System.out.println("The given string is not panagram");
			
	}
}
