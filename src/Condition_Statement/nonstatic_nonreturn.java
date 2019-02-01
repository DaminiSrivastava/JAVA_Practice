package Condition_Statement;

public class nonstatic_nonreturn {
public void Add(int a, int b){
		int c= a+b;
		System.out.println("the addition is "  +c);
		
		
}
public static void main(String[] args) {
	nonstatic_nonreturn obj=new nonstatic_nonreturn();
	obj.Add(10,20);
}
}
