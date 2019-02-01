package Simple_program;

public class thiskeyword {
	int rollno;
	String name;
	float mark;
	void Student(int rollno,String name,float mark){
		this.rollno = rollno;
		this.name= name;
		this.mark= mark;
		System.out.println("the student info is " +rollno +name +mark);
		
	}
	
	public static void main(String[]args){
		thiskeyword obj = new thiskeyword();
		thiskeyword obj2 =new thiskeyword();
		obj.Student(11, "Damini", 100f);
		obj2.Student(2, "Srivastava", 20f);
	}
	

}
