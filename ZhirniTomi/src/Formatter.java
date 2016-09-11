import java.util.Scanner;

public class Formatter {
 static Formatter x;
 static Scanner scnr;
 
	public static void main(String[] args) {
		try{
			x= new Formatter("res//1.txt ");
			scnr=new Scanner(System.in);
			
			System.out.println("—к≥льки вам рок≥в?");
			String years=scnr.next();
			System.out.println("як вас звати?");
			String name= scnr.next();
			System.out.println("ƒе ви проживаЇте?");
			String gorod=scnr.next();
			
			x.format("ћене звати %s, мне %d, € проживаю в м≥ст≥ %s",years,name,gorod);
		}catch(Exception e){
			
		}
				

	}

}
