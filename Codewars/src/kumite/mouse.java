package kumite;

public class mouse extends animal{

	int peremennaya = 4;
	
	public static void zapomnit() {
		System.out.println("i am from mouse");
	}
	
	public static void main(String[] args) {
		animal an = new mouse();

		an.zapomnit();
		System.out.println(an.peremennaya);
	}

}
