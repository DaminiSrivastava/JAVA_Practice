package OOPS_Program;

class VehicleInterface1 implements VehicleInterface{
	public void Draw(){
		System.out.println("Rectangle");
	}
	public void Run(){
		System.out.println("running safely");
	}
	public static void main (String []args){
		VehicleInterface1 obj = new VehicleInterface1 ();
		obj.Draw();
		obj.Run();
	}

}
