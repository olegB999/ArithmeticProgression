package probleme_codeabbey;

import java.util.Scanner;

public class Maximumofarray {
	//	This problem introduces popular algorithm of the "linear search", which should be learnt thoroughly as it is often used in programming more complex tasks (sorting etc.)
	//
	//	Very common operation on sequence of values, or arrays is to find its extremal value - maximum or minimum. To achieve this one need to store current maximum (or minimum respectively) in a separate variable, and then run through array, comparing each of its elements to this variable. Whenever next value is greater than this temporary variable, this value should be copied into it (as a new maximum).
	//
	//	At the end of the pass this temporary variable will hold the extremum value.
	//
	//	Input data will give you exactly 300 numbers in a single line.
	//	Answer should contain maximum and minimum of these values, separated by space.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int min = 0;
		String returnString = "" ;
		for (int i=0; i < 300; i++){
			int nr = scan.nextInt();
			if(nr<min) {
				min=nr;
			}
			if(nr>max){
				max=nr;

			}
		}
		System.out.println(max+" "+min);

	}
}
