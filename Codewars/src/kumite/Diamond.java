package kumite;

import java.util.Arrays;

public class Diamond {

	public static String print(int n) {

		if (n%2==0 || n <= 0 )return null;
		
		else {
			
			String returnString = "";
			
			String[] arrayString = new String [n];
			
			int lengthOfN = n;
			
			int numberOfSpaces = n/2; 
			
			for(int i = 0; i < n/2 + 1; i++){
				int numberOfAsterisk = 0; 
				String stringOfAsterisk = "";
				
				for (int j = 0; j< 2*(i+1)-1; j++){
					for(int k = 0; k <numberOfSpaces; k++){
						stringOfAsterisk = stringOfAsterisk + " ";
					}
					stringOfAsterisk = stringOfAsterisk + "*";
					numberOfSpaces--;
				}
				
				stringOfAsterisk = stringOfAsterisk + "\n";
				
				arrayString[i] = stringOfAsterisk;
				arrayString[lengthOfN-1] = stringOfAsterisk;
				lengthOfN--;
			}
			
			for(String str : arrayString) {
				returnString = returnString + str;
				System.out.println(str);
			}
			return returnString;
		}
		}
	
	public static void main(String[] args) {
		
	System.out.println(print(15));

	}

}
