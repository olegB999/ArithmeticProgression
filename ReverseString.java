package probleme_codeabbey;

import java.util.Scanner;

public class ReverseString {
	//	Quite a simple task - just to start learning strings...
	//
	//	Input data will contain a single string of small latin letters and few spaces.
	//	Answer should contain the string of the same length with the same characters but in reverse order.
	public static void main(String[] argas) {
		Scanner sc = new Scanner (System.in);
		String result = "";
		String str = sc.nextLine();
		char[] array = str.toCharArray();
		for(int i = array.length-1; 0<=i;i-- ) {
			result+= array[i];
		}
		System.out.println(result);
	}

}
