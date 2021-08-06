package kumite;

public class SwitchAandB {

	public static String switcheroo(String x) {
	    
		String changedString="";
		
		for(int i = 0; i < x.length(); i++){
			
			String addPart = x.charAt(i) == 'a' ? "b" : x.charAt(i) == 'b' ? "a" : "c";
			
			changedString=changedString+addPart;
		}
		
		return changedString;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(switcheroo("bbbacccabbb"));

	}

}
