
public class Hello {

	public static void main(String[] args) {
	
		int i;
		for ( i=1;i<=10;i++){

			if (i%2==0 ){
				continue;}
		System.out.println(i+". "+"Hello VIKA!!!");// TODO Auto-generated method stub
		}
		 int[] numberArray={10,25,19,36};
		 System.out.println("����� 3-�� ������  = "+numberArray[2]);
		 System.out.println("������� ����� ������  = "+numberArray.length);
		
		 
		 //create array � ��������� �����������
		 
		 int[] numArray = new int[25];
		 // add array
		 numArray[0]=12;
		 numArray[10]=numArray[0]*10;
		 System.out.println("����� 0-�� ������  = "+numArray[0]);
		 System.out.println("����� 10-�� ������  = "+numArray[10]);
		
}
}
