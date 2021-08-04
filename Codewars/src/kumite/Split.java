package kumite;

public class Split {

	 static String toCamelCase(String s){
		 String resultString = "";
		 if(s.contains("-")){
			 String[]arrayString = s.split("-");
			 resultString+=arrayString[0];
			 for(int i =1; i< arrayString.length; i++) { 
				 resultString+=(""+arrayString[i].charAt(0)).toUpperCase();
				 char[]arrayChar = arrayString[i].toCharArray();
				 for(int j =1; j< arrayChar.length; j++){
					 resultString+=arrayChar[j];
				 }
			 }
			 return resultString;
		 }
		 else {
			 String[]arrayString = s.split("_");
			 resultString+=arrayString[0];
			 for(int i =1; i< arrayString.length; i++) { 
				 resultString+=(""+arrayString[i].charAt(0)).toUpperCase();
				 char[]arrayChar = arrayString[i].toCharArray();
				 for(int j =1; j< arrayChar.length; j++){
					 resultString+=arrayChar[j];
				 }
			 }
			 return resultString;
		 }
		  }
	
	public static void main(String[] args) {
		//Black-right-Ninja-Samurai-south-Rockstar-bridge-desert-north-Green
		System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));

	}

}
