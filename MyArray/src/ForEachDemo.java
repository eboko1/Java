
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String [] friends = new String[20]; 
		
		friends[0] = "Masha";
		friends[1] = "Matilda";
		friends[2] = "Rosa";
		friends[3] = "Stefanida";
		friends[4] = "Ira";
		
		friends[18] = "Hilary";
		friends[19] = "Natasha";
		// This is cycle FOR Each
		for (String girl : friends){
			System.out.println("I love " + girl);
		}
		System.out.println("This is cycle FOR Each");
	}

}
