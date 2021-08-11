package kumite;

public class RGBtriangle {
	
	static String returnString = "";
	
	public static char triangle(final String row) {

	    if(row.length()==1){
			returnString = "";
			returnString += row.charAt(0);
	    	return row.charAt(0);
	    }
		
		else{

			returnString = "";
			
			for(int i =1; i < row.length(); i++) {
				
				if(row.substring(i-1, i+1).equals("RR")){
					returnString+="R";
				}
				
				else if (row.substring(i-1, i+1).equals("GG")){
					returnString+="G";
				}
				
				else if (row.substring(i-1, i+1).equals("BB")){
					returnString+="B";
				}
				
				else if (row.substring(i-1, i+1).equals("RG") || row.substring(i-1, i+1).equals("GR")){
					returnString+="B";
				}
				
				else if (row.substring(i-1, i+1).equals("GB") || row.substring(i-1, i+1).equals("BG")){
					returnString+="R";
				}
				
				else if (row.substring(i-1, i+1).equals("BR") || row.substring(i-1, i+1).equals("RB")){
					returnString+="G";
				}
				if (i==row.length()-1) {
					triangle(returnString);
				}
			}	
		}
	    return returnString.charAt(0);
	  }

	public static void main(String[] args) {
		System.out.println(triangle("BRRGGB"));
	}

}
