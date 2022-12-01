import java.util.StringTokenizer;

public class OparationCheck {

	char operator;
	String input;
	
	public OparationCheck(char operator, String input) {
		this.operator = operator;
		this.input = input;
	}
	
	public double value_a() {
		int operatorIndex = input.indexOf(operator);
		return Double.valueOf(input.substring(0, operatorIndex));
		//StringTokenizer st = new StringTokenizer(input," ");
		//subdiviser input avec un delimiteur " ".
	}
	
	public double value_b() {
		int operatorIndex = input.indexOf(operator);
		return Double.valueOf(input.substring(operatorIndex+1));
	}	
}
