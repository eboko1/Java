		import java.io.PrintStream;
		import java.util.Scanner;
		 
		public class Numm {
		    public static Scanner in = new Scanner(System.in);
		    public static PrintStream out = System.out;
		    public static void main(String[] args) {
		        int num1, num2, num3=0 ;
		        num1 = in.nextInt();
		        num2 = in.nextInt();
		    
		        num3=num1;
		        num1=num2;
		        num2=num3;
		     
		        
		        out.println(num1+" "+num2);
		   }
	}

