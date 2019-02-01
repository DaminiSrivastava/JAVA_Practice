package OOPS_Program;

public class abstract1_realtine extends abstract_realtime{
void draw(){
	System.out.println("Rectangle ");
}
void run(){
	System.out.println("Runnn");
}
public static void main (String[]args){
	abstract1_realtine obj = new abstract1_realtine();
	obj.draw();
	obj.run();
}
}
