import java.util.Scanner;

import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Soustraction;

public class Context {
	
	OparationCheck oparationCheck;
	
	public void context(String input) {
		if(input.contains("+")) {
			oparationCheck = new OparationCheck('+', input);
			double a = oparationCheck.value_a();
			double b = oparationCheck.value_b();
			new Addition(a, b);
		}else {
			if(input.contains("-")) {
				oparationCheck = new OparationCheck('-', input);
				double a = oparationCheck.value_a();
				double b = oparationCheck.value_b();
				new Soustraction(a, b);
			}else {
				if(input.contains("*")) {
					oparationCheck = new OparationCheck('*', input);
					double a = oparationCheck.value_a();
					double b = oparationCheck.value_b();
					new Multiplication(a, b);
				}else {
					if(input.contains("/")) {
						oparationCheck = new OparationCheck('/', input);
						double a = oparationCheck.value_a();
						double b = oparationCheck.value_b();
						new Division(a, b);
					}else
						System.out.println("aucune operation reconue!!!!");
				}
			}
		}
	}

}
