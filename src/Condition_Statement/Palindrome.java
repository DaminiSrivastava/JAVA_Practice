package Condition_Statement;

public class Palindrome {
	public static void main (String []args){
		//while loop
		int n=454,pal_num=0;
		int temp =n;
		while(n>0){
			pal_num = pal_num*10+n%10;
			n=n/10;
		}
		if (temp==pal_num){
			System.out.println("Yes");
		}
		
			else{
			
				System.out.println("No");
			}
		
		//for loop
		/*int n=454,pal_num=0;
		int temp=n;
		for(;n>0;n=n/10){
			pal_num=pal_num*10+n%10;
		}
		if(temp==pal_num){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}*/
			
			
}
}

		
	
	

	