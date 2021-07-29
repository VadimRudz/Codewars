package kumite;

public class SquareDigit {

	  public int squareDigits(int number) {
		  
		  String str = String.valueOf(number);
		  String resultString = "";
		  
		  
		  for(int i = 0; i< str.length(); i++){ 

			  int squareNumber = (int)Math.pow(str.charAt(i)-'0',2);
			  resultString= resultString +  String.valueOf(squareNumber);
		  }
		  
				  return Integer.parseInt(resultString);    
	  }

	  public static void main(String[] args) {	
	System.out.println(new SquareDigit().squareDigits(0));		  
	}
	  
	}
