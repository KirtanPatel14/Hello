package com.company;

public class Math {


	public static int digitSwapper(int input) {
		// returns the number with the last 2 digits swapped'
		int x = input % 10;
		int y = input / 10 % 10;
		int z = input - (x + y * 10);
		return z + x * 10 + y;
	}

	public static void timeLeft(int currHour, int currMin, int depHour, int depMin) {
		//PRINT the time left here in hours and minutes
		int currtime = (currHour * 60 + currMin);
		int deptime = (depHour * 60 + depMin);
		int difference = (deptime - currtime);
		int hourtime = (difference / 60);
		int mintime = (difference % 60);
		System.out.println(hourtime + " hours "+ mintime + " mins");
	}
	public static int dayOfWeek(int daysOfWeek1, int day)
	{
		// returns an integer corresponding to the day of the week
		int a = (daysOfWeek1 + day - 1) %7;
		return a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 123;
		int output = digitSwapper(input);
		System.out.println(input + " " + output);

		input = 6;
		output = digitSwapper(input);
		System.out.println(input + " " + output);

		input = 381;
		output = digitSwapper(input);
		System.out.println(input + " " + output);

		timeLeft(1, 34, 8, 20);
		timeLeft(1, 15, 4, 36);

		System.out.println(dayOfWeek(0,1));
		System.out.println(dayOfWeek(0,14));
		System.out.println(dayOfWeek(6, 22));
		System.out.println(dayOfWeek(5, 4));
		System.out.println(dayOfWeek(1,24));
		System.out.println(dayOfWeek(2,1));

	}
}
/*
123 132
6 60
381 318
6 hours 46 mins
3 hours 21 mins
0
6
6
1
3
2
 */