// we will reverse the words in string 
//examle, Hello, How are you --> you are How Hello,.
package string.logics;

public class ReverseWordsInString {
public static void main(String[] args) {
	String s = "Hello, how are you?";
	String splittedString[]=s.split(" ");
	for(int i=splittedString.length-1;i>=0;i--) {
		System.out.print(splittedString[i]+" ");
	}
}
}
