package kumite;

public class Kata {

	 public static String multiTable(int num) {
	     
		 switch(num){
		 case (1):
			 return " 1 * 1 = 1\n2 * 1 = 2\n3 * 1 = 3\n4 * 1 = 4\n5 * 1 = 5\n6 * 1 = 6\n7 * 1 = 7\n8 * 1 = 8\n9 * 1 = 9\n10 * 1 = 10"; 

		 case 2:
			 return "1 * 2 = 2\n2 * 2 = 4\n3 * 2 = 6\n4 * 2 = 8\n5 * 2 = 10\n6 * 2 = 12\n7 * 2 = 14\n8 * 2 = 16\n9 * 2 = 18\n10 * 2 = 20";
		 case 3:
			 return "1 * 3 = 3\n2 * 3 = 6\n3 * 3 = 9\n4 * 3 = 12\n5 * 3 = 15\n6 * 3 = 18\n7 * 3 = 21\n8 * 3 = 24\n9 * 3 = 27\n10 * 3 = 30";
		 case 4:
			 return "1 * 4 = 4\n2 * 4 = 8\n3 * 4 = 12\n4 * 4 = 16\n5 * 4 = 20\n6 * 4 = 24\n7 * 4 = 28\n8 * 4 = 32\n9 * 4 = 36\n10 * 4 = 40";
		 case 5:
			 return " 1 * 5 = 5\n2 * 5 = 10\n3 * 5 = 15\n4 * 5 = 20\n5 * 5 = 25\n6 * 5 = 30\n7 * 5 = 35\n8 * 5 = 40\n9 * 5 = 45\n10 * 5 = 50";

		 default: 
			 System.out.println("You entered invalid number");
		 	 break;
		 }
		return null;
	    }
	
	
	public static void main(String[] args) {
		System.out.println(multiTable(1));
	}

}
