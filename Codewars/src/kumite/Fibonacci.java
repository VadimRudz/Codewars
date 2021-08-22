package kumite;

public class Fibonacci {

	public static long fib (int n){
		
		if(n==1){	
			return 1;
		}
		
		else{
			long AtStart = 0;
			long AtEnd = 1;
	
			for(int i = 1; i < n; i++) {
				long middleS = AtStart;
				long middleE = AtEnd;
				AtStart = middleE;
				AtEnd = middleS + middleE;
				System.out.println("Start - " + AtStart + "; End - " + AtEnd);
					}
			return AtEnd;
		   }
		}
	
	public static void main(String[] args) {
		System.out.println(fib(5));
		
	}

}
