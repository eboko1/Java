
public class Option {

	public static void main(String[] args) {
		// передати args
		if (args[0].equals("-en")){
			System.out.println("Опція для англійського язика ");
					}
		else if (args[0].equals("-uk")){
			System.out.println("Опція для українського язика ");
		}
		else {
			System.out.println("Незрозуміла опція ");
		}

	}

}
