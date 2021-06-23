package probleme_codeabbey;

import java.util.Scanner;

public class SumInLoop {
	//	Now our goal is to learn the loops - i.e. repeated actions. Let us find the sum of several numbers (more than two). It will be useful to do this in a loop. As shown in the picture above - you can create variable sum and add every value from the list to it. Perhaps "for" loop will suit nicely since the amount of numbers is known beforehand.
	//
	//	If you have troubles, try Sums In Loop first - it is, probably, easier.
	//
	//	Input data has the following format:
	//
	//	first line contains N - amount of values to sum;
	//	second line contains N values themselves.
	//	Answer should contain a single value - the sum of N values.
	public static void main (String args[]) {
		int sumaF=0;
		int numar=0;
		int n=0;
		Scanner s = new Scanner(System.in);
		int nrDeCifre = s.nextInt();
		while(n!=nrDeCifre) { 
			numar = s.nextInt();
			sumaF=sumaF+numar;
			n++;
		}

		System.out.println(sumaF);

	}
}
