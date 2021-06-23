package probleme_codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class Triangles {
	//	Triangle is an object built of three line segments (sides of triangle), connected by ends. Wiki on triangles provides more detailed explanation.
	//	If we have three line segments with lengths A B C - we either can built a triangle with them
	//	(for example with 3 4 5 or 3 4 7 - though this is with zero area) or we found it impossible
	//	(for example 1 2 4).
	//
	//	You are given several triplets of values representing lengths of the sides of triangles. You should tell from which triplets it is possible to build triangle and for which it is not.
	//
	//	Input data: First line will contain number of triplets.
	//	Other lines will contain triplets themselves (each in separate line).
	//	Answer: You should output 1 or 0 for each triplet (1 if triangle could be built and 0 otherwise).
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String returnAnswer = "";
		int l = s.nextInt();
		for(int i=0;i<l;i++) {
			int[] result = new int[3];
			result[0] = s.nextInt();
			result[1] = s.nextInt();
			result[2] = s.nextInt();
			Arrays.sort(result);
			if((result[0]+result[1])>=result[2]) {
				returnAnswer += 1 + " ";
			}else {
				returnAnswer += 0 + " ";
			}
		}
		System.out.println(returnAnswer);
	}

}
