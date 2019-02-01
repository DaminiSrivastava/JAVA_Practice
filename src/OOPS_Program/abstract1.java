package OOPS_Program;
 class abstract1 extends Abstraction{
	void Run(){
		System.out.println("running safely");
	}
	public static void main (String[]args){
		Abstraction obj = new abstract1();
		obj.Run();
		
	}

}