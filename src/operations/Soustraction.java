package operations;

public class Soustraction {

	double a,b;
	
	public Soustraction(double a, double b) {
		this.a = a;
		this.b = b;
		soustraction();
	}
	
	public void soustraction(){
		System.out.println("Operation de soustraction detecté...");
		System.out.println(this.a-this.b);
	}; 
}
