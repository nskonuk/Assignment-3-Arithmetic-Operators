package assignment3;

public class Q6_caffeinOverdose {

	public static void main(String[] args) {
		/*Question-6

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose*/
		final int lethalOverdose=10000;
		double drinksNumber, mgInDrink=450;
		drinksNumber=lethalOverdose/mgInDrink;
		System.out.println("Number of milligrams in drink: "+mgInDrink);
		System.out.println("It would take about "+drinksNumber+" drinks for lethal overdose");
		
/* The requirements are not clear enough. User story must be changed:) If mg in one drink is above or under 500 
		we can not reach the lethal overdose. Let assume one drink contains 450 mg. With 22 drinks we reach only 9900 mg.
		For this reason ý have declared the drinksNumber as double variable*/
		
		
	}

}
