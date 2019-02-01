package OOPS_Program;

public class Encapsulation {
	
	private String name ="Damini";
	
	public String getName(){
		return name;
		
	}
	public void setName(String name){
		this.name=name;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("GORAKHPUR");
		System.out.println(obj.getName());
		

	}

}
