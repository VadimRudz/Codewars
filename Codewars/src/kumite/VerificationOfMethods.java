package kumite;

public class VerificationOfMethods {

	public static void main(String[] args) {
		String str_1 = "Hi";
		String str_2 = "Vadim";
		
		String str_3  = String.join(",", str_1, str_2);
		
		String [] arrayString = str_3.split(",");
		
		System.out.println(str_3);
		
		for(String str_4:arrayString){
			System.out.println(str_4);
		}
		
		char [] arrayChar  = str_2.toCharArray();
		
		String str_4 = "";
		
		for (char ch_1 : arrayChar) {
			str_4 = str_4 + ch_1 + " ";
		}

		System.out.println(str_4);
		
		String str_5 = "";
		
		for(int i = 0; i < str_1.length(); i++){
			str_5+=str_1.charAt(i) + "!";
		}
		System.out.println(str_5);
	}

}
