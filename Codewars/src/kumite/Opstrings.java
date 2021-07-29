package kumite;

import java.util.Arrays;

public class Opstrings {

	public static String vertMirror (String strng) {
		
		String [] arrayString = strng.split(",");
		
		for(int i = 0; i < arrayString.length; i++) {
			String stringResult = "";
			for(int j = 0; j < arrayString[i].length(); j++) {
				stringResult = arrayString[i].charAt(j) + stringResult;
			}
			arrayString[i] = stringResult;
		}

		strng = "";
		
		for(String stringNewLine : arrayString) {
			strng =String.join("\\",strng, stringNewLine);
		}
		return strng.substring(1);   
    }
	
	public static String horMirror (String strng) {
		String [] arrayString = strng.split(",");	
		for(int i =0; i < arrayString.length; i++){
			arrayString[i] = new StringBuffer(arrayString[i]).reverse().toString();
			System.out.println(arrayString[i]);
		}
		strng = "";
		for(String stringNewLine : arrayString) {
			strng =String.join("\\",strng, stringNewLine);
		}
		return strng.substring(1);  
    }
	
//	public static String oper/**/(UnaryOperator<String> operator, String s) {
//        // your code and complete ... before operator
//    }
	
	public static void main(String[] args) {
		
//	System.out.println(vertMirror("IzOTWE,nkkbeCM,nWuzZxM,nvDddJw,njiJyHF,nPVHfSx"));
	System.out.println(horMirror("IzOTWE,nkkbeCM,nWuzZxM,nvDddJw,njiJyHF,nPVHfSx"));

//	String s = "abcd\nefgh\nijkl\nmnop";
//	oper(vert_mirror, s);
	
	}

}
