package kata;

public class Factorial {

	public int factorial(int n) {

				if( n < 0 || n > 12 ) {
					throw new IllegalArgumentException ();
									  }
				else if (n==0){
						return 1;
							  }
				else {
					int number = 1;
					for (int i = n; i > 0; i-- ){
						number=number*i;
					}
					return number;
					}
	    }
	
	
	public static void main(String[] args) {
		System.out.println(new Factorial().factorial(-1));
	}

}
