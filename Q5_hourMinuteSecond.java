package assignment3;

public class Q5_hourMinuteSecond {

	public static void main(String[] args) {
		/* Question-5

Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds*/
		
		int hour,minutes,seconds,inputSeconds;
		inputSeconds=4596;
		
		seconds=inputSeconds%60;
		hour=inputSeconds/3600;
	    minutes=(inputSeconds/60)%60;
		System.out.println("Input Second is "+inputSeconds);
		System.out.println("");
		System.out.println(hour+" hours "+minutes+" minutes "+seconds+" seconds");
		
		
		
		
		
		
		
	}

}
