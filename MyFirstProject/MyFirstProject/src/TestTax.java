
public class TestTax {

	public static void main(String[] args) {
		
		NJTax t=new NJTax();
		
		
	  t.grossInCame = 40000;
		t.numberOfDependents = 2;
		t.state = "NJ";
	 
		double yourTax = t.calcTax();
		double NJTax=t.adjustForStudents(yourTax);
		
		System.out.println("Your tax is "+NJTax);
		
		// TODO Auto-generated method stub

	}

}
