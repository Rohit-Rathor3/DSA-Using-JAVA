package string.logics;

public class CheckRotaionOfStrings {

	public static void main(String[] args) {
		
		String str="abcd";
		String rotatedString="bcda";
		System.out.println(isRotatedVersion(str, rotatedString));
	}
	
	public static boolean isRotatedVersion(String str, String rotatedString) {
		if(str==null || rotatedString==null)
			return false;
		else if(str.length()!=rotatedString.length())
			return false;
		else {
			String concatedString = str+str;
			return concatedString.contains(rotatedString);
		}
	}
}
