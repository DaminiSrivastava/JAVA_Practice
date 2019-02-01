package Simple_program;

public class EncapsulationAccessor_Getter_Setter {
	private String name;
	//getter
	public String getrollno(){
		return name;
		
	}
	//setter
	public void setrollno(String name){
		this.name = name;
	}
	

	public static void main(String[] args) {
		EncapsulationAccessor_Getter_Setter obj = new EncapsulationAccessor_Getter_Setter();
		obj.setrollno("Damini");
		System.out.println(obj.getrollno());
	}

}
