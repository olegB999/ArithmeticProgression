package probleme_codeabbey;

import java.util.Scanner;

public class WeightedSumOfDigits {
	//	This program resembles more complex algorithms for calculation CRC and other checksums and also hash-functions on character strings. Besides it will provide you with one more exercise on splitting values to decimal digits. You may want to try Sum of Digits before this one.
	//
	//	Let us calculate sum of digits, as earlier, but multiplying each digit by its position (counting from the left, starting from 1). For example, given the value 1776 we calculate such weighted sum of digits (let us call it "wsd") as:
	//
	//	wsd(1776) = 1 * 1 + 7 * 2 + 7 * 3 + 6 * 4 = 60
	//	Input data will give the number of test-cases in the first line.
	//	Values themselves are in the second line. For each of these values you are to calculate weighted sum of digits.
	//	Answer: as usually, put results in one line, separating them with spaces.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String returnSum = "";
		String numbers = null;
		int nr;
		int l=s.nextInt();
		for(int i=0; i<l; i++) {
			int sum = 0;
			nr = s.nextInt();
			numbers = Integer.toString(nr);
			char[] elements = numbers.toCharArray();
			for(int j=0; j<elements.length; j++) {
				sum+=Integer.parseInt(String.valueOf(elements[j]))*(j+1);
			}
			returnSum += sum + " ";
		}
		System.out.println(returnSum);
	}

}
