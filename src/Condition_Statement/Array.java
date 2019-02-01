package Condition_Statement;

public class Array {
	static int a[]={10,20,30};

	public static void main(String[] args) {
		total();
		System.out.println("the sum is" + sum());
		largest();
		

	}
	//sum of the data
	static int sum=0;
	public static int sum(){
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		return sum;
		
	}
	// total length
	public static void total(){
		for(int i=0;i<a.length;i++){
			System.out.println("the total is " +a[i]);
		}
	}
		//largest number
		public static void largest(){
		int max= a[0];
		for(int i = 1; i<a.length; i++){
			if (a[i]>max)max= a[i];
			System.out.println("the largest number is " +max);
			}
			
		}
		
	}


