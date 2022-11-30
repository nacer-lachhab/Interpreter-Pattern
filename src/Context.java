import java.util.Scanner;

import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Soustraction;

public class Context {
	
	public void context(String input) {
		if(input.contains("+")) {
			int operatorIndex = input.indexOf("+");
			double a = Double.valueOf(input.substring(0, operatorIndex));
			Double b = Double.valueOf(input.substring(operatorIndex+1));
			new Addition(a, b);
		}else {
			if(input.contains("-")) {
				int operatorIndex = input.indexOf("-");
				double a = Double.valueOf(input.substring(0, operatorIndex));
				Double b = Double.valueOf(input.substring(operatorIndex+1));
				new Soustraction(a, b);
			}else {
				if(input.contains("*")) {
					int operatorIndex = input.indexOf("*");
					double a = Double.valueOf(input.substring(0, operatorIndex));
					Double b = Double.valueOf(input.substring(operatorIndex+1));
					new Multiplication(a, b);
				}else {
					if(input.contains("/")) {
						int operatorIndex = input.indexOf("/");
						double a = Double.valueOf(input.substring(0, operatorIndex));
						Double b = Double.valueOf(input.substring(operatorIndex+1));
						new Division(a, b);
					}else
						System.out.println("aucune operation reconue!!!!");
				}
			}
		}
	}

}
