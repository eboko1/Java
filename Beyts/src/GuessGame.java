
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame(){
		p1=new Player ();
		p2=new Player ();
		p3=new Player ();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
	//add
		int targetNumber=(int)(Math.random()*10);
		System.out.println("Vidhaday chuslu vid 0 to 9 ");
		
		while(true){
			System.out.println("Chuslo kotre potribno vidhadatu ");
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			System.out.println("I ihrok dymae  "+guessp1);
			guessp2=p2.number;
			System.out.println("II ihrok dymae  "+guessp2);
			guessp3=p3.number;
			System.out.println("III ihrok dymae  "+guessp3);
		if (guessp1==targetNumber){
               p1isRight=true;			
		}
		if (guessp2==targetNumber){
            p2isRight=true;	
		}
		if (guessp3==targetNumber){
            p3isRight=true;	
		}
		
		
		
		}

}
