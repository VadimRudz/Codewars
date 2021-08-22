package kumite;

import java.util.TreeSet;

public class TwoToOne {

	public static String longest (String s1, String s2) {
		
		char[] CharArray = (s1+s2).toCharArray();
		
		TreeSet<String>sortedCharCollection  = new TreeSet<String>();
		
		for(char ch : CharArray) {
			sortedCharCollection.add(""+ch);
		}
		
		String resultString="";
		
		for(String string : sortedCharCollection){
			resultString+=string;
		}
		
		return resultString;
        
    }
	
	public static void main(String[] args) {
		
		System.out.println(longest("inmanylanguages", "theresapairoffunctions"));

	}
	
}
