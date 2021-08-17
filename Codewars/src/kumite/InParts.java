package kumite;

public class InParts {

	public static String splitInParts(String s, int partLength) {
		
		String [] arrayString = s.split(" ");
		
		String middleString = "";
		
		for(String str : arrayString){
			middleString+=str;
		}
		
		String theEndString = "";
		int counter = 0;
		
		for(int i = 0; i < middleString.length(); i++) {
			if(counter == partLength){
				counter = 1;
				theEndString+=" ";
				theEndString+=middleString.charAt(i);
			}
			else{
				theEndString+=middleString.charAt(i);
				counter++;
			}
		}

		return theEndString;
	
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(splitInParts("HelloKata", 9));
	}

}
