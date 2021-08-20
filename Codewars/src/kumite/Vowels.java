package kumite;

public class Vowels {

	public static int getCount(String str) {
	    int vowelsCount = 0;
	   
	    char [] charArray = str.toCharArray();
	    
	    for ( char ch : charArray) {
	    	
	    	if(ch == 'a' || ch == 'e'|| ch =='i' ||ch == 'o'||ch =='u') {
	    		vowelsCount++;
	    	}
	    	
	    }
	    return vowelsCount;
	  }
	
	
	public static void main(String[] args) {
		
		System.out.println(getCount("abracadabra"));

	}

}
