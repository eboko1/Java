
public class Hello {

	public static void main(String[] args) {
	
		int i;
		for ( i=1;i<=10;i++){

			if (i%2==0 ){
				continue;}
		System.out.println(i+". "+"Hello VIKA!!!");// TODO Auto-generated method stub
		}
		 int[] numberArray={10,25,19,36};
		 System.out.println("Номер 3-го масива  = "+numberArray[2]);
		 System.out.println("Довжина нашог масива  = "+numberArray.length);
		
		 
		 //create array з подальшим доповненням
		 
		 int[] numArray = new int[25];
		 // add array
		 numArray[0]=12;
		 numArray[10]=numArray[0]*10;
		 System.out.println("Номер 0-го масива  = "+numArray[0]);
		 System.out.println("Номер 10-го масива  = "+numArray[10]);
		
}
}
