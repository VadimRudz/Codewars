package exampleException;

public class Square {

	public static int countSquare(int a, int b) throws SquareException {
		
		if( a<0 || b<0) {
			throw new SquareException(a,b, "one of square sides is less than 0");
		}
		else return a*b;
	}
	
	public static void main(String[] args) {
		try{
		System.out.print(countSquare(-1,2));}
		catch (SquareException se){
			System.out.println(se.getMessage());
		};

	}

}
