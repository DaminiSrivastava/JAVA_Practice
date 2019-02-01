package OOPS_Program;

public class Overloading {
	public int add(int a,int b){
		
		return a+b;
		
		
	}
	public double add(double a,double b){
	
		return a+b;
		
	}
	public static void main (String []args){
		Overloading obj = new Overloading();
		System.out.println(obj.add(1, 2.0));
		System.out.println(obj.add(2, 3));
	}

}
