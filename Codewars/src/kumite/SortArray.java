package kumite;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
	public static int[] sortArray(int[] array) {
		
		List<Integer> copyArray = new ArrayList<Integer>();
		
		for (int i : array)
		{
			copyArray.add(i);
		}
		
		
		
	    return array;
	  }

	public static void main(String[] args) {
		sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });

	}

}
