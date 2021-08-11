package kumite;

public class HalvingSum {

	int halvingSum(int n) {
		
		int rest = n;
		
		int summRest = n;
		
		while(rest / 2 > 0){
			
			rest = rest / 2;
			
			summRest = summRest + rest;
		}
		return summRest; 
	  }
	
	public static void main(String[] args) {
		
		HalvingSum first = new HalvingSum();
		
		System.out.println(first.halvingSum(127));

	}

}
