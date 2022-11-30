import java.util.Scanner;

public class DemoInterpreter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("attente d'expression de calcul....");
		String input = sc.nextLine();
		Context ctx = new Context();
		ctx.context(input);
	}
}
