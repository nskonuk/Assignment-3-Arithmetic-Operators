package assignment3;

public class Q4_SwapValues {

	public static void main(String[] args) {
		/*Question-4

Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2

      Sample output:

      n1=10
      n2=20

      ----------

      n1=20
      n2=10*/
		
		int Num1,Num2,X;
		Num1=10;
		Num2=20;
	    System.out.println("Num1="+Num1);
	    System.out.println("Num2= "+Num2);
	    System.out.println("------------");
		X=Num1;
		Num1=Num2;
		Num2=X;
		
		
	    System.out.println("Num1="+Num1);
		System.out.println("Num2= "+Num2);

	}

}
