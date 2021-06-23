package probleme_codeabbey;

import java.util.Scanner;

public class MedianofThree {
	//	To have more practice with conditional statements we are going to write a program which uses complex condition. I.e. one if ... else statement could be (and should be) nested inside other to solve this problem.
	//
	//	Several triplets of numbers are given to you. Your task is to select minimum among each of triplets.
	//
	//	Input data will contain in the first line the number of triplets to follow.
	//	Next lines will contain one triplet each.
	//	Answer should contain selected minimums of triplets, separated by spaces.

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String returnMed = "";
		int a, b, c;
		int l = s.nextInt();
		for(int i=0; i<l; i++) {
			int med=0;
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			if ((a>b&&a<c)||(a<b&&a>c)) {
				med=a;	
			}
			if ((b>a&&b<c)||(b<a&&b>c)) {
				med=b;
			}	
			if ((c>b&&c<a)||(c<b&&c>a)) {
				med=c;
			}
			returnMed += med + " ";
		}
		System.out.println(returnMed);

	}

}
