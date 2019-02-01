package Simple_program;


public class Palindrome_String {

	public static void main(String[] args) {
		
		String chr =  "mom";
		String reverse = "";
		int len= chr.length();
		for(int i = len - 1; i > -1; i--){
			reverse = reverse + chr.charAt(i);
		}
			System.out.println("The reverse name is : " +reverse);
		
		if(chr.equals(reverse)){
			System.out.println("Yes");
		}
		else{
			System.out.println("no");
		}
	}
}



