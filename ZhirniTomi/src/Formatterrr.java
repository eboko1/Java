import java.util.Scanner;
import java.util.Formatter;

public class Formatterrr {
	static Formatter x;
	 static Scanner scnr;
	
	
	public static void main(String[] args) {
		try{
			x= new Formatter("res//1.txt ");
			scnr=new Scanner(System.in);
			
			System.out.println("������ ��� ����?");
			String years=scnr.next();
			System.out.println("�� ��� �����?");
			String name= scnr.next();
			System.out.println("�� �� ���������?");
			String gorod=scnr.next();
			
			x.format("���� ����� %s, ��� %d, � �������� � ��� %s",years,name,gorod);
		}catch(Exception e){
			
		}
	}

}
