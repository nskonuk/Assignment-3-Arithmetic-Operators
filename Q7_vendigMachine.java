package assignment3;

public class Q7_vendigMachine {

	public static void main(String[] args) {
		/*Question-7

Write a program that determines the change to be dispensed from a vending machine.
 An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments 
 (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles*/
		final int input=100;
		final int quarter=25;
		final int dime=10;
		final int nickel=5;
		
		int itemPrice=45, numberNickels, numberDimes, numberQuarters;
		numberQuarters=(input-itemPrice)/quarter;
		numberDimes=((input-itemPrice)-numberQuarters*quarter)/dime;
		numberNickels=(((input-itemPrice)-numberQuarters*quarter)-numberDimes*dime)/nickel;
		
		System.out.println("Price in cents : "+itemPrice);
		System.out.println("Your change is "+numberQuarters+" quarters, "+numberDimes+" dimes,"+" and "+numberNickels+" nickels");
		
		
		
	}

}
