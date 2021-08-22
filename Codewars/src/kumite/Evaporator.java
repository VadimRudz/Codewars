package kumite;

public class Evaporator {

	public static int evaporator(double content, double evap_per_day, double threshold) {
	    
	double gasResidue = content;
	
	int numberOfDays = 0;
		
	while (gasResidue>=content*(threshold/100)) {
		
		gasResidue =gasResidue- gasResidue*(evap_per_day/100);
		
		numberOfDays++;
		
	}
	
			return numberOfDays;
		}
		
	public static void main(String[] args) {
		
		System.out.println(evaporator(10, 10, 10));

	}

}
