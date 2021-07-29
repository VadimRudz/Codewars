package kumite;

public class Kata {
	
	 public static String getMiddle(String word) {
		
		 if(word.length()%2==0){
			 return ""+word.charAt((word.length()-1)/2)+word.charAt((word.length())/2);
		 }
		 
		 else {
			 return ""+word.charAt((word.length())/2);
		 }
		  }

	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("middle"));
		System.out.println(getMiddle("testing"));
		System.out.println(getMiddle("A"));
	}
}
