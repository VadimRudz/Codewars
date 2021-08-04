package kumite;

public class FindOdd {

	public static int findIt(int[] a) {
		for(int i=0; i<a.length;i++) {
			int count = 0;
			for (int j=0; j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count%2!=0){
				return a[i];
			}
		}
	  	
		return 1;
	  }
	
	public static void main(String[] args) {
		System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));

	}

}
