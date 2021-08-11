package kumite;

public class Arge {
	
	public static int nbYear(int p0, double percent, int aug, int p) {
		
		int newPopuation = p0;
		
		int yers = 0;
		
		while(newPopuation<p){
			
			newPopuation = newPopuation + (int) (newPopuation * percent )/100 + aug;
			yers++;
		}
		
		return yers;
			
        //nbYear((int) (p0+aug+p0*(percent/100)), percent, aug, p) + 1
    }

	public static void main(String[] args) {
		
		System.out.println(nbYear(1500000, 0.25, 1000, 2000000));

	}

}
