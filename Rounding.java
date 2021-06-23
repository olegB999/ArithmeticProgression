package probleme_codeabbey;

import java.util.Scanner;

public class Rounding {
	public static void main(String[] args) {
		double a;
		double b;
		double n;
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		String returnString = "" ;
		for (int i=0; i < lines; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			n = a/b;
				returnString += Math.round(n) + " ";
			
		}
		System.out.println(returnString);



	}
}
