package kumite;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAllDuplicateWords {

	public static String removeDuplicateWords(String s){
       
		String [] stringArray = s.split(" ");
		
		Set <String> setArray = new LinkedHashSet<String>();
		
		for(String str : stringArray) {
			setArray.add(str);	
		}
		
		String result = "";
		
		for(String str : setArray) {
			
			result += " " + str;	
		}
		
        return result.substring(1);
    }
	
	public static void main(String[] args) {
		
		System.out.println(removeDuplicateWords("my cat is my cat fat"));

	}

}
