package kumite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Valley {

	public static int[] makeValley(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i : arr) {
			list.add(i);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
	
		int [] arrayEnd = new int [list.size()];
		
		if(list.size()==1) {
			return arr;
		}
		
		else if(list.size()%2!=0) {
		
		int end = list.size()-1;
		int start = 0;
		int count = 0;
		for(int i = 0; i < list.size()/2 ; i++) {
			
			arrayEnd[count] = list.get(start);
			arrayEnd[end] = list.get(start+1);
			count++;
			start=start + 2;
			end--;
			
			if(i== list.size()/2-1){
				arrayEnd[list.size()/2] = list.get(start);
			}
		}
		
		return arrayEnd;}
		else {
			int end = list.size()-1;
			int start = 0;
			int count = 0;
			for(int i = 0; i < list.size()/2 ; i++) {
				
				arrayEnd[count] = list.get(start);
				arrayEnd[end] = list.get(start+1);
				count++;
				start=start + 2;
				end--;
			}
			
			return arrayEnd;
		}
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(makeValley(new int[] { 20, 7, 6, 2 })));

	}

} //17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17
