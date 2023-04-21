// There are  basicly 5 methods to split the string in Java.
package string.logics;

public class TotalWaysToSplitTheString {

	public static void main(String[] args) {
		String s ="091-1234567891";
		
		/*
		 1. split method String str[]=s.split("-");    This method returns String[];
		 */
		
		/*
		 *2.  List<String> strings = Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());   This way, return List.
		 */
		
		/*
		 * 3. StringTokenizer stri = new StringTokenizer(s,"-");
		 * while(stri.hasMoreTokens()) { String s1= stri.nextToken();
		 * System.out.println(s1); }
		 */
		
		/* 4. StringUtils.split(s,"-");  // This is third party supplied so, we have to include Jar files.\\
		 * This method returns String[];
		 *  */
		
		/*
		 *5. Iterable<String> s1= Splitter.on("-").split(s); // by using guave jar file
		 */		
		
		System.out.println(s.compareTo("091-123456789"));
		  
	
		
		
		
		
	}
}
