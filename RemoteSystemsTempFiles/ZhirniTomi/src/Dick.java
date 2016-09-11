import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;

public class Dick {
 static String [] [] mas=new String  [5] [3];
 static Scanner scnr;
	public static void main(String[] args) {
             openFile();
             readFile();
             out();
             
	}

	private static void out() {
		// out monitor
		for(int row=0; row<mas.length;row++){
			for(int col=0; col<mas.length; col++){
				System.out.println(mas[row][col]+" ");		
			}
			System.out.println();
		}
		
		
		
	}

	private static void readFile() {
		while(scnr.hasNext()){
			for (int row =0; row<mas.length;row++){
				for(int col=0;col<mas.length;col++){
				mas[row][col]=scnr.next();	
				}
			}
		}
	}

	private static void openFile() {
		 try {
			scnr= new Scanner(new File ("res//1.txt"));
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "Файл не найден");
			}
		}
}
