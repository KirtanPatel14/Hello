package com.company;

public class Math {


    public static int digitswapper(int input) {
// returns the number with the last 2 digits swapped
	}

	public static void timeLeft(int currHour, int currMin, int depHour, int depMin)
	{
		//PRINT the time left here in hours and minutes
	}
	public static int dayOfWeek(int daysOfWeek1, int day)
	{

		// returns an integer corresponding to the day of the week
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 123;
		int output = digitSwapper(input);
		System.out.println(input +" " + output);

		input = 6;
		output = digitSwapper(input);
		System.out.println(input +" " + output);

		input = 381;
		output = digitSwapper(input);
		System.out.println(input +" " + output);

		timeLeft(1,34, 8, 20);
		timeLeft(1,15, 4, 36);

		System.out.println(dayOfWeek(0,1));
		System.out.println(dayOfWeek(0,14));
		System.out.println(dayOfWeek(6, 22));
		System.out.println(dayOfWeek(5, 4));
		System.out.println(dayOfWeek(1,24));
		System.out.println(dayOfWeek(2,1));
    }
}