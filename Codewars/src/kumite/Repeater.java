package kumite;

public class Repeater {

	public static String repeat(String string,long n){
		
		String repeat = "";
		
		for(int i = 0; i< n; i++){
			repeat += string;
		}
		
		return repeat;
	  }
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(repeat("Wub ", 6));
		
	}

}
