package Simple_program;

public class Regular_Expression {
	
 static final String text = "I am a good girl";

	public static void main(String[] args) {
		System.out.println(text.matches("\\w.*"));

	}

}
