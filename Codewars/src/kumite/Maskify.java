package kata;

public class Maskify {
    public static String maskify(String str) {
    	String returnString ="";
    	if(str.length()>4){
    		
          for (int i = 0; i< str.length()-4; i++){
        	  returnString+="#";
          }
          for (int j = str.length()-4; j< str.length(); j++){
        	  returnString+=str.charAt(j);
          }
          return returnString;
    	}	
    	else {
    		for(int i = 0; i< str.length(); i++){
    			returnString+=str.charAt(i);
    		}
    		return returnString;
    	}
    }
    
    public static void main(String[] args) {
    	Maskify maskify = new Maskify();
    	System.out.println(maskify.maskify("1234"));
	}
}