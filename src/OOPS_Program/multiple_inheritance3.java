package OOPS_Program;

 class multiple_inheritance3 implements Multiple_Inheritance, Multiple_Inheritance1 {
	public void print(){
		System.out.println("Damini is a good girl");
	}
	public void Show(){
		System.out.println("She is learning java");
	}
	public static void main (String[]args){
		multiple_inheritance3 obj = new multiple_inheritance3();
		obj.print();
		obj.Show();
	}
}
