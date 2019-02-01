package Simple_program;

public class Access_Modifiers_private {
	private int age=24;
	
	private void Customer(String name){
		System.out.println(String.format("Hello,%s", name));	
	}
	public int getAge(){
		return age;
		
	}
	public void setAge(int age){
		this.age=age;
	}
}
	 class PrivateExample{
	public static void main(String[] args) {
		
		Access_Modifiers_private obj = new Access_Modifiers_private ();
		System.out.println(obj.getAge());
		
			

	
		
		

	}

}
	 
