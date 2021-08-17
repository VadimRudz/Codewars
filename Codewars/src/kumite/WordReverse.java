package kumite;

import java.util.ArrayList;

public class WordReverse {
	
	public static String reverseWords(final String original)
	  {
		ArrayList<String>arrayWords = new ArrayList<>();
		
		String stackVariable = "";
			
		for (int i = 0; i < original.length(); i++) {
			
			if(original.charAt(i) != ' '){
				stackVariable += original.charAt(i);
				//System.out.println(stackVariable);
				
				if(i==original.length()-1){
					arrayWords.add(stackVariable);
				}
			}
			else {
				//System.out.println(stackVariable);
				arrayWords.add(stackVariable);
				stackVariable = "";
				arrayWords.add(" ");
			}	
		}
		//System.out.println(arrayWords.toString());
		String returnString = "";
		
		for(String str:arrayWords){
			returnString +=  new StringBuilder(str).reverse().toString();
		}
		
		return returnString;
	  }

	public static void main(String[] args) {
		
		System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
	}

}
