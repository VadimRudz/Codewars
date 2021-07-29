package kumite;

public class House {

	public static long overTheRoad(long address, long n) {
	   
		return n*2+1 - address;
	  }
	
	public static void main(String[] args) {
		System.out.println(overTheRoad(23633656673L, 310027696726L));

	}

}
