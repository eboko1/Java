
public class Tax {
int numberOfDependents;
double grossInCame;
String state;

public double calcTax(){
	if (grossInCame < 50000){
		return grossInCame*0.10;
	}
		else {
			return grossInCame*0.13;
		}
	}
}
