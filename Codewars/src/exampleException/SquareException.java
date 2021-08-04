package exampleException;

public class SquareException extends Exception{

	int sideA;
	int sideB;
	
	SquareException(int sideA, int sideB, String msg){
		
		super(msg);
		
		this.sideA = sideA;
		
		this.sideB = sideB;
	}
}
