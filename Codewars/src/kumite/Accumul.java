package kumite;

public class Accumul {
	
	public static String accum(String str) {
		
		String [] arrayString = str.split("") ; 
		String resultString="";
		
		for(int i =0; i< arrayString.length; i++){

			
			resultString = resultString + arrayString[i].toUpperCase();
			
			for(int j = 0; j < i; j++){
				resultString = resultString + arrayString[i].toLowerCase();
			}
			resultString = resultString + "-";
		}
		
		return resultString.substring(0, resultString.length()-1);
	    
	    }

	public static void main(String[] args) {
		
		System.out.println(accum("ZpglnRxqenU"));
		
		String str_1 = "hello";
		String str_2 = "it is me";
		String str_4 = "can you hear me?";
		String str_3 = String.join(",", str_1, str_2, str_4);
		System.out.println(str_3);
		
		String [] arrayString = new String [] {"1", "2", "3", "4"};
		String str_5 = "";
		for(String str:arrayString){
			str_5 =String.join(",",str_5, str);
		}
		System.out.println(str_5.substring(1));
		
	}
}
