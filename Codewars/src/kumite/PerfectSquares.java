package kumite;

public class PerfectSquares {
	
	public static String findSquares(int n){
			int big = n/2 + 1;
			int small = n/2;
			if(Math.pow(big,2)>2147483647){
				long bigLong = (long) big;
				long smallLong = (long) small;
				return bigLong*bigLong + "-" + smallLong*smallLong;
			}
			return (int)Math.pow(big,2)+ "-" + (int)Math.pow(small,2);		
	  }

	public static void main(String[] args) {
		System.out.println(findSquares(9));
	}

}
