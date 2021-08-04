package kata;

import java.util.ArrayList;
//убирает одинаковые символы в строках
class Solution{    
    public static String[] dup(String[] arr){
		
    	ArrayList<String> array = new ArrayList<String>();
    	
    	for(String str : arr) {
    		String ourString= new String("");
    	    int j = 0;
    	    for (int i=0; i<str.length()-1 ; i++){
    	        j = i+1;
    	        if(str.charAt(i)!=str.charAt(j)){
    	            ourString+=str.charAt(i);
    	        }
    	        if(i==str.length()-2){
    	        	ourString+=str.charAt(str.length()-1);
    	        }
    	    } 
    	    array.add(ourString);
    	}   
		return array.toArray(new String[0]);
    }
}