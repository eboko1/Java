import java.util.Scanner;
import java.util.Formatter;

public class Formatterrr {
	static Formatter x;
	 static Scanner scnr;
	
	
	public static void main(String[] args) {
		try{
			x= new Formatter("res//2.txt ");
			scnr=new Scanner(System.in);
			
			System.out.println("������ ��� ����?");
			int years=(int)Double.parseDouble(scnr.next());			
			System.out.println("�� ��� �����?");
			String name= scnr.next();
			System.out.println("�� �� ���������?");
			String gorod=scnr.next();
		    x.format("���� ����� %s, ��� %d, � �������� � ��� %s",years,name,gorod);
	        x.close();
		}catch(Exception e){}
	}

}
