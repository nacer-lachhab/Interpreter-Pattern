package operations;

public class Multiplication {

	double a,b;
	
	public Multiplication(double a, double b) {
		this.a = a;
		this.b = b;
		multiplication();
	}
	
	public void multiplication(){
		System.out.println("Operation de multiplication detecté...");
		System.out.println(this.a*this.b);
	}; 
}
