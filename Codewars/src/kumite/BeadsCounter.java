package kumite;

public class BeadsCounter {
	
	public static int countRedBeads(final int nBlue) {
	     
		return nBlue<2? 0:(nBlue-1)*2; 
			
	    }

	public static void main(String[] args) {
		
 System.out.println(countRedBeads(5));
	}

}
