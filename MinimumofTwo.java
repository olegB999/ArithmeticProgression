package probleme_codeabbey;

import java.util.Scanner;

public class MinimumofTwo {
	//	Most programs should be able to make some choices and decisions. And we are going to practice conditional programming now.
	//	This is usually done by a kind of if ... else statements which may look like:
	//
	//	IF some_condition THEN
	//	    do_something
	//	ELSE
	//	    do_other_thing
	//	ENDIF
	//	Depending on your programming language syntax could be different and else part is almost always optional. You can read more in wikipedia article on Conditional statements.
	//
	//	Of two numbers, please, select one with minimum value. Here are several pairs of numbers for thorough testing.
	//
	//	Input data will contain number of test-cases in the first line.
	//	Following lines will contain a pair of numbers to compare each.
	//	For Answer please enter the same amount of minimums separated by space
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		int a = 0;
		int b = 0;
		String returnString = "" ;
		for (int i=0; i < lines; i++)
		{
			a = scan.nextInt();
			b = scan.nextInt();
			if(a<b) {
				returnString += a + " ";
			}else {
				returnString += b + " ";
			}
		}
		System.out.println(returnString);



	}
}
