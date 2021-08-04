package kata;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class WhichAreIn {
	
	public static String[] inArray(String[] array1, String[] array2) {
		SortedSet<String> hashSet = new <String> TreeSet();
		 
		for(String stringUpper:array1){
			
			for(String stringUnder:array2){
				int i = -1;
				i = stringUnder.indexOf(stringUpper);
				if(i==-1){
					continue;
				}
				else {
					hashSet.add(stringUpper);
				}
			}
			
		}
		
		String arr[] = new String[hashSet.size()];

		return hashSet.toArray(arr);
	}
	

	public static void main(String[] args) {
	System.out.println(Arrays.toString(inArray(new String[]{ "live","arp", "strong" },new String[] { "lively", "alive", "harp", "sharp", "armstrong" })));
	System.out.println(Arrays.toString(inArray(new String[]{ "tarp", "mice", "bull" },new String[] { "lively", "alive", "harp", "sharp", "armstrong" })));	

//
	}

}
