package kumite;

public class Fibonacci {

	public static long fib (int n){
		
		return n <= 1 ? n : fib(n - 1) + fib(n - 2);
		
	}

	public static void main(String[] args) {

	}

}
