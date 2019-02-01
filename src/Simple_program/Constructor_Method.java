package Simple_program;

public class Constructor_Method {
	
	public Constructor_Method(){
      System.out.println("Welcome damini");
		
	}
	
	public void getName(String name){
		System.out.println("Customer name is " +name);
	}

	public static void main(String[] args) {
		Constructor_Method obj1= new Constructor_Method();
		obj1.getName("Srivastava");
		
		
		

	}

}
