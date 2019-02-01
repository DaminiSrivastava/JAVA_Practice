package Condition_Statement;

public class Instant_method {

	public static void main(String[] args) {
		Instant_method obj = new Instant_method();
		obj.Add(5, 10);
		//System.out.println("the sum is : " +Sum(10,30));
		Additon(20,50);
		
		

	}
	//Without static
	public void Add(int a, int b){
		int c= a+b;
		System.out.println("the add is: " +c);
		
	}
	//With static and return type
	public static int Sum(int a, int b){
		int c = a+b;
		return c;
		
	}
	

	//With static and non return type
	public static void Additon(int a, int b){
		int c = a+b;
		System.out.println("the addition is :" +c);
		
	}

}
