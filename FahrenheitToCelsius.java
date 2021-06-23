package probleme_codeabbey;

import java.util.Scanner;

public class FahrenheitToCelsius {
	//	There are two widespread systems of measuring temperature - Celsius and Fahrenheit. First is quite popular in Europe and second is well in use in United States for example.
	//
	//	By Celsius scale water freezes at 0 degrees and boils at 100 degrees. By Fahrenheit water freezes at 32 degrees and boils at 212 degrees. You may learn more from wikipedia on Fahrenheit. Use these two points for conversion of other temperatures.
	//
	//	You are to write program to convert degrees of Fahrenheit to Celsius.
	//
	//	Input data contains N+1 values, first of them is N itself (Note that you should not try to convert it).
	//	Answer should contain exactly N results, rounded to nearest integer and separated by spaces.
	public static void main(String[] args) {
		double f;
		double c;
		String returnString = "";
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			f = scan.nextInt();
			c = (f-32)*5/9;
			returnString += Math.round(c)+" ";
		}
		System.out.println(returnString);
	}
}
