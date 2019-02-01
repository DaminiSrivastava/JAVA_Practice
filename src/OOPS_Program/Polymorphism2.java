package OOPS_Program;

public class Polymorphism2 extends Polymorphism{
	 void eat(){
	
		System.out.println("eating");
	}
	

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism2();//upcasting
		obj.eat();
	
		

	}

}
