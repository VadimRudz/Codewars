package kumite;

public class WrapPresent {
	
	public static int wrap(int height, int width, int length){
	   
		
	return	height<=width && height <= length ? (4*height + 2*width + 2*length) + 20 : width<=height && width <= length ? 
			(4*width + 2*height + 2*length) + 20 : (4*length + 2*height + 2*width)+20;
		
	}
	public static void main(String[] args) {
		
		System.out.println(wrap(1,3,1));

	}

}
