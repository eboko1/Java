
public class FriendsArray {

	public static void main(String[] args) {
		
		String [] friends = new String[20]; 
		
		friends[0] = "Masha";
		friends[1] = "Matilda";
		friends[2] = "Rosa";
		friends[3] = "Stefanida";
		friends[4] = "Ira";
		
		friends[18] = "Hilary";
		friends[19] = "Natasha";
		
		int totalElement = friends.length;
		int i;
		// This is cycle FOR Loops
		for (i = 0; i < totalElement; i++){
			if (friends[i] == "Stefanida"){
				System.out.println("I not love " + friends[i]);
				continue;
			}
			// This is cycle FOR Each
			
			// This is break with cycle
			if (friends[i] == "Hilary"){
					break;
				}	
			System.out.println("I love " + friends[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
