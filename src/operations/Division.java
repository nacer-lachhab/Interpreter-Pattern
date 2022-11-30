package operations;

public class Division {

	double a,b;
	
	public Division(double a, double b) {
		this.a = a;
		this.b = b;
		division();
	}
	
	public void division(){
		System.out.println("Operation de division detecté...");
		System.out.println(this.a/this.b);
	}; 
}
