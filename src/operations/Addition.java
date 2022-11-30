package operations;

public class Addition {

	double a,b;
	
	public Addition(double a, double b) {
		this.a = a;
		this.b = b;
		addition();
	}
	
	public void addition(){
		System.out.println("Operation d'adition detecté...");
		System.out.println(this.a+this.b);
	}; 
}
