import java.util.Scanner;
public class NP {

	public static void main(String[] args) {
      int nNumber,nPlus, nMinus;
      
      @SuppressWarnings("resource")
       Scanner inputNumScanner = new Scanner(System.in);
      System.out.println("Enter Number: ");
	  nNumber = inputNumScanner.nextInt();
	  nPlus=nPlus(nNumber);
      nMinus=nMinus(nNumber);
      
    System.out.println("The next number for the number "+nNumber+" is "+nPlus+"." );
    System.out.println("The previous number for the number "+nNumber+" is "+nMinus+"." ); 
        }
          public static int nPlus(int nPlus){
           nPlus = nPlus + 1;
          return nPlus;
            }  
          public static int nMinus(int nMinus){
    	   nMinus = nMinus - 1;
           return nMinus;    
 
	        }
         
          try {
        	  if (e.equals(int nNumber))
        	  
        	    
        	  
          }catch (Exception e){
        	  System.out.println("Plaese enter INTEGER Number: ");
          }
         
}
