package kumite;

public class HighestAndLowest {
	
	public static String highAndLow(String numbers) {
	  
		String [] arrayString = numbers.split(" ");
		int [] arrayInt = new int[arrayString.length];
		
		for (int i =0; i< arrayString.length; i++){
			arrayInt[i] = Integer.valueOf(arrayString[i]);
		}
		
		int maxValue = arrayInt[0];
		int minValue = arrayInt[0];
		for(int j : arrayInt) {
			if(maxValue<j){
				maxValue=j;
			}
			if(minValue>j){
				minValue=j;
			}
		}
		
	    return maxValue+ " " + minValue;
	  }

	public static void main(String[] args) {
		System.out.println(highAndLow("1 9 3 4 -5"));

	}

}
