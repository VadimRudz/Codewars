package kumite;

public class TestString {

	public static void main(String[] args) {
		String add = "123456";
		String str = "ABCD";
		str+=add.charAt(0);
		System.out.println(str);

		str+=add.charAt(1);
		System.out.println(str);
		
		str += "Hello";
		System.out.println(str);
	}

}
