package kumite;

public class BumpsTheRoad {

	public static String bumps(final String road) {
	   
		int count = 0;
		
		for(int i = 0; i < road.length(); i++){
			
			if(road.charAt(i) == 'n') {
				count++;
			}	
		}
		return count > 15 ? "Car Dead" : "Woohoo!";
	  }
	
	
	public static void main(String[] args) {
		
		System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));

	}

}
