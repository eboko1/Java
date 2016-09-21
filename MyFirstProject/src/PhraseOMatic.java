public class PhraseOMatic{
public static void main (String[] args){
String[] wordListOne={"kryhlosytochnuy","vzaemnuy","frontend"};
String[] wordListTwo={"trydnuy","setevoy","yscorenuy"};
String[] wordListThree={"proces","talant","obzor"};

int  oneLength=wordListOne.length;
int  twoLength=wordListTwo.length;
int  threeLength=wordListThree.length;



int rand1= (int)(Math.random()*oneLength);
int rand2= (int)(Math.random()*twoLength);
int rand3= (int)(Math.random()*threeLength);

String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

System.out.println("Vse sho potribno, it is "+phrase);
}
}