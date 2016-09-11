import java.util.Scanner;
public class Convert {

	public static void main(String[] args) {
		float daysFloat=365.25f;
		String weeksString="52";
		
		int daysInt=(int)daysFloat;
		int weeksInt=Integer.parseInt(weeksString);
		
		//
		System.out.println("daysInt= "+daysInt);		
        System.out.println("weeksInt= "+weeksInt);
		
		int week =(daysInt/weeksInt);
		System.out.println("ƒн≥в в тижн≥ "+week);
		
		Scanner scn=new Scanner(System.in);
		
		
	}

	
}
