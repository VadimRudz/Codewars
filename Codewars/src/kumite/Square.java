package kumite;

public class Square {

	public static boolean isSquare(int n) { 
		
	return	Math.sqrt(n)%1 == 0 ? true : false; 
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(isSquare(0));
		
	}

}
