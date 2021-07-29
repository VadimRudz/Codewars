package kumite;

public class Solution {
	
	public static int zeros(int n) {
	    
		int factorialInt = 1;
		
		if(n==0){
			return 0;
		}
		else{
			
			for(int i = n; i > 0; i--){
				factorialInt = factorialInt * i;
			}
			return factorialInt;
		}
	  }
	

	public static void main(String[] args) {
		System.out.println(zeros(3));	
	}

}
