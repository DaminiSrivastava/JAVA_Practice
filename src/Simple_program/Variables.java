package Simple_program;

public class Variables {
	public int rollno;//Instance Variable,public -visible for any child class
	private String name;//Instance Variable,private- visible for this (Variables) class only
	public static int phnno;//Class variable
	public static final double PI= 3.14;//Constant variable- It will not change the value
	
	public void Stringname(){
		int age=10;//Local Variable
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.Stringname();

	}

}
