package kumite;

import java.util.Arrays;

public class DivSeven {
	
	public static long[] seven(long m) {
		
		long count = 0;
		while (m > 99) {
			long y = m % 10;
			m = (m - y) / 10 - (2 * y);
			count++;
		}
		return new long[]{m, count};
       
    }

	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(seven(1021)));

	}

}
