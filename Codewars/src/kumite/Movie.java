package kumite;

public class Movie {

	public static int movie(int card, int ticket, double perc) {
		double priceA = 0;
		double priceB = card;
		int count = 0;
		
		while (Math.ceil(priceB) >= priceA) {
			
			count++;
			
			priceA = ticket*count;
			
			priceB += ticket* Math.pow(perc, count);
		}

		return count;
        
    }
	
	
	public static void main(String[] args) {
		
		System.out.println(movie(500, 15, 0.9));
		
	}

}
