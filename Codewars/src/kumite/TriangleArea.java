package kumite;

public class TriangleArea {

	public static float tArea(String tStr) {
	   
		int numberOfPoints = 0;
		
		for ( int i = 0; i< tStr.length(); i++) {
			if(tStr.charAt(i)=='.'){
				numberOfPoints++;
			}
		}
		
		float numberOfLines =(float) ((((Math.sqrt(8*numberOfPoints+1))-1)/2)-1);
		
	    return (numberOfLines*numberOfLines)/2;
	  }
	
	public static void main(String[] args) {
		
		System.out.println("\n.\n. .\n");
		
		System.out.println(tArea("\n.\n. .\n"));

	}

}
